import java.io.*;
import java.util.*;
public class Swapnum
{
 public static void main(String args[])
 {
  int a,b,z;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  a=s.nextInt();
  b=s.nextInt();
  z=a;
  a=b;
  b=z;
  System.out.println(a+" "+b);
 }
}
