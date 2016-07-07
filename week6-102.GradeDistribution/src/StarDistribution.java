
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class StarDistribution {
    private String numberOfFives;
    private String numberOfFours;
    private String numberOfThrees;
    private String numberOfTwos;
    private String numberOfOnes;
    private String numberOfZeroes;
    private int totalScores;
    private int accepted;

    public StarDistribution() {
        numberOfFives = "";
        numberOfFours = "";
        numberOfThrees = "";
        numberOfTwos = "";
        numberOfOnes = "";
        numberOfZeroes = "";
        totalScores = 0;
        accepted = 0;
    }
    
    
    public void createStars( ExamClassScoreSet exam ){
        for ( int score : exam.getExamScores()) {
            if ( score >= 50 ) {
                numberOfFives += "*";
                accepted++;
            } else if ( score >=  45) {
                numberOfFours += "*";
                accepted++;
            } else if ( score >= 40 ) {
                numberOfThrees += "*";
                accepted++;
            } else if ( score >= 35 ) {
                numberOfTwos += "*";
                accepted++;
            } else if ( score >= 30 ) {
                numberOfOnes += "*";
                accepted++;
            } else if ( score >= 0 ) {
                numberOfZeroes += "*";
            }
        totalScores++;
        }
    }
    
    public String getFives(){
        return numberOfFives;
    }
    public String getFours(){
        return numberOfFours;
    }
    public String getThrees(){
        return numberOfThrees;
    }
    public String getTwos(){
        return numberOfTwos;
    }
    public String getOnes(){
        return numberOfOnes;
    }
    public String getZeroes(){
        return numberOfZeroes;
    }
    public double acceptPercent(){
        if ( totalScores >= 1 ) {
            return (100 * accepted) / totalScores;
        }
        return 0;
    }
    
}
