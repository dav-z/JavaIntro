/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
import java.util.ArrayList;
/**
 *
 * @author dav
 */
public class TestBank {
    ArrayList<GenerateQuestion> GenerateQuestions;
    int totalPoints;
    TestBank() {
        GenerateQuestions = new ArrayList<GenerateQuestion>();
    }
    TestBank(ArrayList<GenerateQuestion> GenerateQuestions) {
        this.GenerateQuestions = GenerateQuestions;
        for (int i = 0; i < GenerateQuestions.size(); i++) {
            totalPoints += GenerateQuestions.get(i).point;
        }
    }
    public void addGenerateQuestion(GenerateQuestion q) {
        GenerateQuestions.add(q);
    }
    @Override
    public String toString() {
        return "No of GenerateQuestion : " + GenerateQuestions.size() + " Total Points : " + totalPoints;
    } 
}
