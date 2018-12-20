public class Nestedif
{
    public static void main(String[]args){
               int age=60;
               if(age<50){
                   System.out.println("the person is young");
               }
               else{
                   System.out.println("you are old");
                   if(age>=75)
                   {
                       System.out.println("really the person is very old");
                   }
                   else{
                       System.out.println("dnt wry u r not old");
                   }
               }
    }
}
