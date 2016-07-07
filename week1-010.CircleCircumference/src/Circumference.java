
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double radius;
        double result;
        // Program your solution here 
        
        System.out.print("Type the radius: ");
        radius = Integer.parseInt(reader.nextLine());
        
        result = 2 * Math.PI * radius;
        
        System.out.println("Circumfrence of the circle: " + result);
    }
}
