import java.io.*;
import java.util.*;
class PositiveorNegative
{
  public static void main(String args[])
   {
     int a;
     Scanner s1=new Scanner();
     System.out.println("Enter the value");
     a=s1.nextInt();
       if(a>0)
       {
         System.out.println("Given number is positive");
       }
       elseif(a<0)
       {
         System.out.println("Given number is negative");
       }
       else
       {
         System.out.println("Given number is zero");
       }
   }
}
