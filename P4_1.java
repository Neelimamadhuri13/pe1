import java.util.*;

public class P4_1
{
    public static void main(String[] args)
    {
        int i, j;
        System.out.println("enter any number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (i = 1; i <= num; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
        }
    }
}

