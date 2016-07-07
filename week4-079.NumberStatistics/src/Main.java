import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int entry = 0;
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics tracker = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        while ( true ) {            
            System.out.println("Type numbers:");
            entry = Integer.parseInt(reader.nextLine());
            if ( entry == -1) {
                break;
            }
            tracker.addNumber(entry);
            if ( entry % 2 == 0 ) {
                even.addNumber(entry);
            } else if ( entry % 2 != 0){
                odd.addNumber(entry);
            }
        }
        System.out.println("sum: " + tracker.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
        
        

    }
}
