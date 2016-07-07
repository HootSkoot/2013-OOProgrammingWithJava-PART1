/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class LyyraCard {
    private double balance;
    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart;
    }
    
    public String toString(){
        return "The card has " + balance + " euros";
    }
    public void payEconomical() {
        // write code here
        if ( balance >= 2.5 ) {
            balance = balance -2.5;
        }
        
    }

    public void payGourmet() {
        // write code here
        if ( balance >= 4.0) {
            balance = balance - 4.0;
        }
    }
    public void loadMoney(double amount) {
        // write code here
        if ( amount >= 0) {
            balance = balance + amount;
        }
        if ( balance > 150.0 ) {
            balance = 150.0;
        }
    }
}
