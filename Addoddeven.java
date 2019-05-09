import java.io.*;
import java.util.*;
public class Addoddeven
{
 public static void main(String args[])
 {
  int a,b,c;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  a=s.nextInt();
  b=s.nextInt();
  c=a+b;
  if(c%2==0)
  {
   System.out.println("Even");
  }
  else
  {
   System.out.println("Odd");
  }
 }
}
