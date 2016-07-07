
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
public class BirdListing {
    private ArrayList<Bird> birdDB;

    public BirdListing() {
        birdDB = new ArrayList<Bird>();
    }
    
    public void addBird( Bird bird ){
        birdDB.add(bird);
    }

    public ArrayList<Bird> getBirdDB() {
        return birdDB;
    }
    
    
}
