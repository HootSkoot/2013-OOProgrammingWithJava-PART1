import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 1;
        int count = 1;
        
        while ( count <= number ) {            
            sum *= count;
            count++;
        }
        System.out.println("Factorial is " + sum);

    }
}
