import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double avrg = (double)sum(list) / list.size();
        return avrg;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double delta = 0;
        double avg = average(list);
        for (Integer number : list) {
            delta += Math.pow(number - avg, 2.0);
        }
        double variant = delta / ( list.size() - 1 );
        return variant;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
