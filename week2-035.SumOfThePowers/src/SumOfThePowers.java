
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        
        int count = 0;
        int result;
        int sum = 0;
        
        while ( count <= n ) {            
            result = (int)Math.pow(2, count);
            sum += result;
            count++;
        }
        
        System.out.println("The result is " + sum);

    }
}
