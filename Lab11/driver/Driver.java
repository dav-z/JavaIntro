/*
David Zheng
Lab 11
 */
package driver;

/**
 *
 * @author dav
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Driver {
    
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        TestBank t = new TestBank();
        GenerateQuestion q1 = new ObjectiveGenerateQuestion(10, 5, 10, "\nWho lives in a pineapple under the sea?\nPeter\nSpongebob\nEric\n", "Spongebob");
        GenerateQuestion q2 = new FillInTheBlank(10, 3, 10, "\n___ was the 16th US President?\n", "Abraham");
        t.addGenerateQuestion(q1);
        t.addGenerateQuestion(q2);
        System.out.println(t);
        Key ak = new Key(t);
        BufferedWriter out = null;
        System.out.println(q1.toString());
        try {        
            FileWriter fstream = new FileWriter("TestBank.txt", true); //true tells to append data.
            out = new BufferedWriter(fstream);
            for(GenerateQuestion q: ak.TestBank.GenerateQuestions) {  
                System.out.println(q.GenerateQuestionText);
                String ans = sc.next();
                ak.addAnswer(q, ans);
                out.write(ak.toString());
            }
            System.out.println(ak);
       }
       catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
       }     
       finally {
           if(out != null) {
                out.close();
           }
       }
   }
}
