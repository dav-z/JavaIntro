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
public class ObjectiveGenerateQuestion extends GenerateQuestion {
    String correctAnswer;
    ObjectiveGenerateQuestion(int point,int diff, int ansSpace, String text, String corr){
        super(point, diff, ansSpace, text);
        correctAnswer = corr;
    }
    @Override
    public String toString() {
        return "__ " + GenerateQuestionText + "point = " + point + " , difficulty = " + difficulty + " , space = " + answerSpace + " , correct answer = " + correctAnswer + " , Student answer";
    }
}
