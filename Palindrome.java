import java.io.*;
import java.util.*;
public class Palindrome
{
 public static void main(String args[])
 {
  int num,rev=0;
  int z;
  System.out.println("Enter a number");
  Scanner s=new Scanner(System.in);
  z=num;
  if(num<=1000)
  {
   while(num!=0)
   {
    int digit=num%10;
    rev=rev*10+digit;
    num=num/10;
   }
  System.out.println("Reverse " +rev);
  }
  else
  {
   System.out.println("Invalid Input");
  }
  if(z==rev)
  {
   System.out.println("Yes");
  }
  else
  {
   System.out.println("No");
  }
 }
}
