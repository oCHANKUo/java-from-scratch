import java.util.Scanner;

public class mathClass {
    public static void main(String[] args) {
        
        // System.out.println(Math.PI); 
        // System.out.println(Math.E); // Eulers Number

        double result;

        result = Math.pow(2, 3); 
        result = Math.abs(-5); 
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14); // round up
        result = Math.floor(3.99); // round down
        result = Math.max(10, 20);
        result = Math.min(10, 20);


        // HYPOTENUSE

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of Side A: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println(c);
        scanner.close();
    }
}
