
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int number = 1;
        System.out.println("Up to what number? ");
        int userNumber = Integer.parseInt(reader.nextLine());
        
        while ( number <= userNumber ) {            
            System.out.println(number);
            number++;
        }
        
        
    }
}