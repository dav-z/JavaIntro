/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;
/**
 *
 * @author dav
 */
public class GenerateQuestion {

    static String correctAnswer;
    int point;
    int difficulty;
    int answerSpace;
    String GenerateQuestionText;
    GenerateQuestion(int point, int diff, int ansSpace, String text) {
        this.point = point;
        difficulty = diff;
        answerSpace = ansSpace;
        GenerateQuestionText = text;
    }
//    @Override
//    public String toString() {
//        return GenerateQuestionText + "point = " + point + " , difficulty = " + difficulty + " , space = " + answerSpace + " , Student answer";
//    }
}
