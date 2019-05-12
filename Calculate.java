import java.io.*;
import java.util.*;
public class Calculate
{
 public static void main(String args[])
 {
  int p,t,r;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  p=s.nextInt();
  t=s.nextInt();
  r=s.nextInt();
  System.out.println((p*t*r)/100);
 }
}
