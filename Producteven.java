import java.io.*;
import java.util.*;
public class Producteven
{
 public static void main(String args[])
 {
  int n,m,p;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  m=s.nextInt();
  p=n*m;
   if(p%2==0)
   {
    System.out.println("Even");
   }
   else
   {
    System.out.println("Odd");
   }
 }
}
