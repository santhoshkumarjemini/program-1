import java.io.*;
import java.util.*;
import java.lang.*;
public class Arithmetic
{
 public static void main(String args[])
 {
  double a,b,y;
  char c;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  a=in.nextInt();
  c=in.next().charAt(0);
  b=in.nextInt();
  switch(c)
  {
   case '+':
     y=a+b;
     System.out.format("%.0f",y);
     break;
   case '-':
     y=a-b;
     System.out.format("%.0f",y);
     break;
   case '*':
     y=a*b;
     System.out.format("%.0f",y);
     break;
   case '/':
     y=a/b;
     System.out.format("%.0f",y);
     break;
   case '%':
     y=a%b;
     System.out.format("%.0f",y);
     break;
  }
 }
}
