
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int sum = 0;
        int count = 1;
        
        System.out.println("Until what? ");
        int lastSum = Integer.parseInt(reader.nextLine());
        
        while ( count <= lastSum ) {            
            sum += count;
            count++;
        }
        System.out.println("Sum is " + sum);

    }
}
