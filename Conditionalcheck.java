import java.util.Scanner;

public class Conditionalcheck {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s1.nextInt();

        if (n % 2 == 0 && n > 20 && n < 30) {
            System.out.println("Jerry");
        } else {
            System.out.println("Tom");
        }
    }
}