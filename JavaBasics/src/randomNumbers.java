import java.util.Random;

public class randomNumbers {

    // RANDOM NUMBERS

    public static void main(String[] args) {
        
        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number4;
        boolean isHeads;

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1, 7);
        number4 = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        if(isHeads){
            System.out.println("heads");
        }
        else{
            System.out.println("tails");
        }
    }
    
}
