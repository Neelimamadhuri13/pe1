import java.util.*;
public class P5_1
{
    public static void main(String[]arg)
    {
        int sum=0;
        while(true)
        {

            Scanner scan=new Scanner(System.in);
            System.out.println("enter any other number");
            int num=scan.nextInt();
            sum=sum+num;
            System.out.println("want to exit ? enter yes for exit");
            String str=scan.next();

            if(str.equalsIgnoreCase("yes"))
            {
                System.exit(0);
            }
            System.out.println("sum is"+ " " +sum);
        }

    }
}
