
import java.util.Scanner;

public class mathClassCircle {

    public static void main(String[] args) {

        // CIRCUMFERENCE, AREA, VOLUME

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume = 0;

        System.out.println("Enter the Radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Circumference: %.2f", circumference);
        System.out.printf("\nArea: %.2f", area);
        System.out.printf("\nVolume: %.2f", volume);

        scanner.close();
    }
}
