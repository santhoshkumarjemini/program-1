import java.io.*;
import java.util.*;
public class Swapnum
{
 public static void main(String args[])
 {
  int a,b;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  a=s.nextInt();
  b=s.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println(a+" "+b);
 }
}
