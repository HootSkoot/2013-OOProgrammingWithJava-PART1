/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class BoundedCounter {
    private int counter;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit){
        this.upperLimit = upperLimit;
    }
    public void next(){
        counter++;
        if ( counter > upperLimit ) {
            counter = 0;
        }
    }
    public String toString(){
        if ( counter < 10 ) {
            return "0" + counter;
        } else {
            return "" + counter;
        }
    }
    public int getValue() {
        // write here code that returns the value
        return counter;
    }
    public void setValue(int counter ){
        if ( counter >= 0 && counter <= upperLimit ) {
            this.counter = counter;
        }
    }
}
