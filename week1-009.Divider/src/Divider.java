
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double result;
        
        // Implement your program here. Remember to ask the input from user.
        
        System.out.print("Type a number:");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number:");
        int num2 = Integer.parseInt(reader.nextLine());
        
        result = (double)num1 / num2;
        
        System.out.println("Division: " + num1 + " / " + num2 + " = " + result);
    }
}
