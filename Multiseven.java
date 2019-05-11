import java.io.*;
import java.util.*;
public class Multiseven
{
 public static void main(String args[])
 {
  int n;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
   if(n%7==0)
   {
    System.out.println("Yes");
   }
   else
   {
    System.out.println("No");
   }
 }
}
