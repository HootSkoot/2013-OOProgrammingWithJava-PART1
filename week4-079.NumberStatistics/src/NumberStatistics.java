
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        sum += number;
        amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
    public int sum(){
        return sum;
    }
    public double average(){
        if ( amountOfNumbers() == 0 ){
            return 0;
        } else {
        return (double)sum() / amountOfNumbers();
        }
    }
}
