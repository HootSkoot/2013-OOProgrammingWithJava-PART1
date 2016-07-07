import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random;
    private int length;


    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            char symbol;
            int i = 0;
            String password = "";
        
        while ( i < length) {            
            int charPicker = random.nextInt(26);
            symbol = "abcdefghijklmnopqrstuvwxyz".charAt(charPicker);
            password = password + symbol;
            i++;
        }
        
        return password;
    }
}
