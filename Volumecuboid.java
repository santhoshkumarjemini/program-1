import java.io.*;
import java.util.*;
public class Volumecuboid
{
 public static void main(String args[])
 {
  int l,b,h;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  l=in.nextInt();
  b=in.nextInt();
  h=in.nextInt();
  System.out.println((2*l*b)+(2*l*h)+(2*b*h)+" ");
  System.out.println(l*b*h);
 }
}
