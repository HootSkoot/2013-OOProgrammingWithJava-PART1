
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class ExamClassScoreSet {
    ArrayList<Integer> examScores;

    public ExamClassScoreSet() {
        examScores = new ArrayList<Integer>();
    }
    public void addScore(int score){
        examScores.add(score);
    }

    public ArrayList<Integer> getExamScores() {
        return examScores;
    }
    public int getScore( int i ){
        return examScores.get(i);
    }
    
}
