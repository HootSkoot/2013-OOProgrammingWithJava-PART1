
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
        Scanner reader = new Scanner(System.in);
        Command command = new Command();
        BirdListing birdDatabase = new BirdListing();
        
        while (true) {            
            System.out.println("?");
            command.query(birdDatabase, reader);
            if ( command.getQuit() ) {
                break;
            }
        }
    }

}
