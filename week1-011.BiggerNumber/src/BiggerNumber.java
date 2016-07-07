
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int larger;

        // Implement your program here. Remember to ask the input from user
        
        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        
        larger = Math.max(num1, num2);
        
        System.out.println("The bigger number of the two numbers given was: " + larger );
    }
}
