/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

import java.util.Scanner;
/**
 *
 * @author dav
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    
    static String stuff;
    static String scriptFinal;
    static String script1;
    static String script2;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Send me a script.");
        String stuff = scanner.nextLine();
        replacewicked(stuff);
//        replacear(script1);
//        replacerh(script2);
        System.out.println(scriptFinal);
    }
    
    public static void replacerh(String script2) {
        script2 = "" + script2;
        script2 = script1.toLowerCase();
        int i, j;
        char ch, ch1;
        j = script2.length();
        for (i = 0; i < j; i++) {
            ch = script2.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ch1 = script2.charAt(i + 1);
                if (ch1 == 'r') {
                    scriptFinal = script2.replace('r', 'h');
                }
            }
        }
    }
    
    public static void replacear(String script1) {
        int i, j;
        j = script1.length();
        char ch;
        for (i = 0; i < j; i++) {
            ch = script1.charAt(i);
            if (ch == 'a') {
                script2 = script1 + 'r';
            }
        }
        replacerh(script2);
    }
    
    public static void replacewicked(String script) {
        script1 = script.replaceAll("very", "wicked");
        replacear(script1);
    }
}