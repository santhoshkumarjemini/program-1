import java.io.*;
import java.util.*;
public class Printeven
{
 public static void main(String args[])
 {
  int n;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
   if(n%2!=0)
   {
    n=n-1;
    System.out.println(n);
   }
   else
   {
    System.out.println(n);
   }
 }
}
