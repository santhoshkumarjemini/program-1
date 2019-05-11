import java.io.*;
import java.util.*;
public class Areafarm
{
 public static void main(String args[])
 {
  double a,b,c;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  a=s.nextFloat();
  b=s.nextFloat();
  c=a*b;
  System.out.format("%.5f",c);
 }
}
