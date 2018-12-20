import java.util.Scanner;
 public class Polindrome {
    public static void main(String[]args)
    {
                int x,reverse=0,temp;
                int n=124;//It is the number variable to be checked for palindrome
                temp=n;
                while(n>0){
                    x=n%10;  //getting remainder
                    reverse=(reverse*10)+x;
                    n=n/10;
                }
                if(temp==reverse)
                    System.out.println("palindrome number ");
                else
                    System.out.println("not palindrome");
            }
        }



