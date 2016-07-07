
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        cashInRegister = 1000;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        double econPrice = 2.50;
        // if the given cash is at least the price of the lunch:
        if ( cashGiven >= econPrice ) {
            cashInRegister += econPrice;
            economicalSold++;
            return cashGiven - econPrice;
        } else {
            return cashGiven;
        }
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens        
    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        double gourmPrice = 4.00;
        // if the given cash is at least the price of the lunch:
        if ( cashGiven >= gourmPrice ) {
            cashInRegister += gourmPrice;
            gourmetSold++;
            return cashGiven - gourmPrice;
        } else {
            return cashGiven;
        }
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    }
    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        double econPrice = 2.50;
        // if the balance of the card is at least the price of the lunch:
        if ( card.balance() >= econPrice) {
            economicalSold++;
            card.pay(econPrice);
            return true;
        } else {
            return false;
        }
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }
    
    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        double gourmPrice = 4.00;
        // if the balance of the card is at least the price of the lunch:
        if ( card.balance() >= gourmPrice) {
            gourmetSold++;
            card.pay(gourmPrice);
            return true;
        } else {
            return false;
        }
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
    }
    
    public void loadMoneyToCard(LyyraCard card, double sum) {
   // ...
        if ( sum >= 0 ) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}