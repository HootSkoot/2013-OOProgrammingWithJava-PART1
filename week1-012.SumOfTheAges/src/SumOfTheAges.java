
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int age1;
        int age2;
        int combinedAges;

        // Implement your program here
        
        System.out.print("Type your name: ");
        String name1 = reader.nextLine();
        System.out.print("Type your age: ");
        age1 = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String name2 = reader.nextLine();
        System.out.print("Type your age: ");
        age2 = Integer.parseInt(reader.nextLine());        
        
        combinedAges = age1 + age2;
        
        System.out.println(name1 + " and " + name2 + " are " + combinedAges + " years old in total.");
    }
}
