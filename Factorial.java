import java.io.*;
import java.util.*;
public class Factorial
{
 public static void main(String args[])
  {
   int i=1,fact=1;
   int n;
   System.out.println("Enter a number");
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   while(i<=n)
   {
    fact=fact*i;
   }
  System.out.println("Factorial is "+fact );
  }
}
