import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String help = "";
        int count = 1;
        while ( count <= text.length() ) {            
            char character = text.charAt( text.length() - count );
            help = help + character;
            count++;
        }
        return help.equals(text);
    }

    public static void n(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
