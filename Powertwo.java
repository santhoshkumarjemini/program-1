import java.io.*;
import java.util.*;
public class Powertwo
{
 public static void main(String args[])
 {
  int number;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  number=s.nextInt();
   if(isPowerOfTwo(number))
   {
    System.out.println("Yes");
   }
   else
   {
    System.out.println("No");
   }
 }
 private static boolean isPowerOfTwo(int number)
 {
  if(number%2!=0)
  {
   return false;
  }
  else
  {
   for(int i=0;i<=number;i++)
   {
    if(Math.pow(2,i)==number)
     return true;
   }
  }
  return false;
 }
}
