
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
public class Command {
    private String scanCom;
    private boolean hasQuit;

    public Command() {
        scanCom = "";
        hasQuit = false;
    }
    
    
    
    public void query( BirdListing birdDB, Scanner reader){
        String name = "";
        String latinName = "";
        String observe = "";
        boolean seen = false;
        
        scanCom = reader.nextLine();

        
        if ( scanCom.contains("Add")) {
            System.out.println("Name: ");
            name = reader.nextLine();
            System.out.println("Latin Name: ");
            latinName = reader.nextLine();
            birdDB.addBird(new Bird(name, latinName));
        } else if ( scanCom.contains("Observation")) {
            System.out.println("What was observed:? ");
            observe = reader.nextLine();
            for (Bird bird : birdDB.getBirdDB()) {
                if ( bird.getName().contains(observe) || bird.getLatinName().contains(observe)) {
                    bird.isObserved();
                    seen = true;
                }
            } if ( !seen ) {
                System.out.println("Is not a bird!");
            }
            
        } else if ( scanCom.contains("Statistics")) {
            for (Bird bird : birdDB.getBirdDB()) {
                System.out.println(bird);
            }
        } else if ( scanCom.contains("Show")) {
            System.out.println("What?");
            name = reader.nextLine();
            for (Bird bird : birdDB.getBirdDB()) {
                if ( bird.getName().contains(name) || bird.getLatinName().contains(name)) {
                    System.out.println(bird);
                }
            }
        } else if ( scanCom.contains("Quit")) {
            hasQuit = true;
        }
    }
    
    public boolean getQuit(){
        return hasQuit;
    }
}
