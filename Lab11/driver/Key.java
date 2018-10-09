/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/**
 *
 * @author dav
 */
public class Key {
    TestBank TestBank;
    HashMap<GenerateQuestion, String> answers;
    Key(TestBank t) {
        TestBank = t;
        answers = new HashMap<GenerateQuestion, String>();
    }
    public void addAnswer(GenerateQuestion q, String ans) {
        if (q instanceof ObjectiveGenerateQuestion){
            answers.put(q, ans);
        }
        else if (q instanceof FillInTheBlank){
            answers.put(q, "_" + ans + "_ " + q.GenerateQuestionText);
        }
        else if (q instanceof MultipleChoice){
            answers.put(q, "****" + ans + "****");
        }
    }
    @Override
    public String toString() {
        String anss = "";
        Iterator it = answers.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            String qa = pair.getKey() + " = " + pair.getValue() + "\n";
            anss += qa;
        }
        return anss;
    }
}
