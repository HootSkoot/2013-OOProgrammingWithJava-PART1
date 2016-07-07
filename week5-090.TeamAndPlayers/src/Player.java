/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Player {
    private String name;
    private int goals;
    
    public Player(String playerName, int playerGoals){
        name = playerName;
        goals = playerGoals;
    }
    public Player( String playerName){
        this(playerName, 0 );
    }
    public String getName(){
        return name;
    }
    public int goals(){
        return goals;
    }
    public String toString(){
        return name + ", goals " + goals;
    }
}
