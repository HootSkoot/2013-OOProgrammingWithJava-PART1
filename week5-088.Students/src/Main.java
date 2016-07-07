
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        String name = "placeholder";
        String studentNumber = "placeholder";
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        while ( true ) {            
            System.out.print("name: ");
            name = reader.nextLine();
            if ( name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            if ( !name.isEmpty() ) {
                list.add( new Student(name, studentNumber));
            }
        }
        
        for (Student student : list) {
            System.out.println(student);
        }
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result:");
        for (Student student : list) {
            if ( student.getName().contains(searchTerm) ) {
                System.out.println(student.toString());
            }
        }
    }
}