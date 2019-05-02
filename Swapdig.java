import java.io.*;
import java.util.*;
public class Swapdig
{
 public static void main(String args[])
 {
  int num1,num2;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  num1=s.nextInt();
  num2=s.nextInt();
  num1=num1^num2;
  num2=num1^num2;
  num1=num1^num2;
  System.out.println(num1+" "+num2);
 }
}
