/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Counter {
    private boolean check;
    private int counterValue;
    
    public Counter( int startingValue, boolean check){
        this.check = check;
        this.counterValue = startingValue;
    }
    public Counter( int startingValue ){
        this(startingValue, false);
    }
    public Counter( boolean check ){
        this( 0, check);
    }
    public Counter(){
        this( 0, false);
    }
    public int value(){
        return counterValue;
    }
    public void increase(){
        counterValue++;
    }
    public void decrease(){
        decrease(1);
    }
    public void increase( int increaseAmount){
        if ( increaseAmount >= 0) {
            counterValue += increaseAmount;
        }
    }
    public void decrease( int decreaseAmount){
        if ( decreaseAmount >= 0 ) {
            counterValue -= decreaseAmount;
            if ( check && counterValue < 0 ) {
            counterValue = 0;
            }
        }
    }
}
