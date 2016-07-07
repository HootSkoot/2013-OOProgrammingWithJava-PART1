
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus( Money added){
        Money cloneMoney = new Money( euros + added.euros(), cents + added.cents());
        return cloneMoney;
    }
    public boolean less(Money compared){
        if ( compared.euros() > euros) {
            return true;
        }else if ( compared.euros() == euros) {
            if ( compared.cents() > cents) {
                return true;
            }
        }
        return false;
    }
    public Money minus(Money decremented){
        int minusEuros = euros - decremented.euros();
        int minusCents = cents - decremented.cents();
        if ( minusCents < 0) {
            minusCents += 100;
            minusEuros--;
        } if ( minusEuros < 0) {
            return new Money(0, 0);
        }
        return new Money(minusEuros, minusCents);
    }

}
