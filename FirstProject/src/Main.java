
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args){
        
        // THIS IS MY FIRST jAVA PROGRAM
        
        /*
        This 
        is
        a 
        multiline
        comment
         */

        System.out.println("I Like Pizza!");
        System.out.println("It's really good");
        System.out.println("By me Pizza!");

        // VARIABLES
        int age = 21;
        int year = 2026;

        double price = 19.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;

        if (isStudent) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }

        String name = "Chanku";
        String food = "Mango";



        // USER INPUTS
        System.out.println("Your choice is a " + food + " " + price);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String inputName = scanner.nextLine();

        System.err.print("Enter Your Age: ");
        int inputAge = scanner.nextInt();
        scanner.nextLine(); // When accepting an Int before a String, it can cause errors due to input buffers. This empty nextLine() solves it

        System.out.print("What is your GPA: ");
        double inputGPA = scanner.nextDouble();

        System.out.println("Are you a Student? (true/false)");
        boolean inputIsStudent = scanner.nextBoolean();

        System.out.println("Hello " + inputName + " You are " + inputAge + " years old." + " Your GPA is " + inputGPA + "Student: " + inputIsStudent);

        scanner.close();
    }
}
