public class printf {
    public static void main(String[] args) {
        
        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstletter = 's';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
        double thousands = 50000.00;

        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstletter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.1f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        
        System.out.printf("%s is %d years old\n", name, age);


        // Flags
        System.out.printf("Flagged height: %+.2f\n", height);

        // Comma grouping seperator
        System.out.printf("Comma Grouping Seperator: %,+.2f\n", thousands);

        // Negative numbers are enclosed in ()
        double negative = 10.00;
        System.out.printf("Negative: %(.2f\n", negative);

        // width
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
    }
}
