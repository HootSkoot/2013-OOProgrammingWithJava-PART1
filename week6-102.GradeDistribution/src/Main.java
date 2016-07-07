import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ExamClassScoreSet exam = new ExamClassScoreSet();
        StarDistribution dist = new StarDistribution();
        
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        enterExamScores(exam, reader);
        dist.createStars(exam);
        
        System.out.println("Grade distribution:");
        System.out.println("5: " + dist.getFives());
        System.out.println("4: " + dist.getFours());
        System.out.println("3: " + dist.getThrees());
        System.out.println("2: " + dist.getTwos());
        System.out.println("1: " + dist.getOnes());
        System.out.println("0: " + dist.getZeroes());
        System.out.println("Acceptance percentage: " + dist.acceptPercent());
        
    }
    public static void enterExamScores(ExamClassScoreSet exam, Scanner reader){
        int entry;
        while ( true ) {            
            System.out.println("Type exam scores, -1 completes:");
            entry = Integer.parseInt(reader.nextLine());
            if ( entry == -1 ) {
                break;
            } else if ( entry <= 60 && entry >=0 ) {
                exam.addScore(entry);
            }
        }
    }
}
