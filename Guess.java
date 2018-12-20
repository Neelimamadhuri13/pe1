import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Guess {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = 50;
        int min = 1;
        int user_input;
        Random rand = new Random();
        int random_number = rand.nextInt(max) + 1;  //random_number is basically the original number;
        while (true) {
            System.out.println("enter the number you want to guess");
            user_input = sc.nextInt();
            if (user_input > random_number) {
                System.out.println("number guessed is more than the original number");
                System.out.println(random_number);
            } else if (user_input < random_number) {
                System.out.println("number guessed is less than the original number");
                System.out.println(random_number);
            } else {
                System.out.println("number guessed is equal to the original number");
                break;
            }

        }
    }
}
