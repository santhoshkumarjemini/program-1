import java.io.*;
import java.util.*;
public class Mod
{
 public static void main(String args[])
 {
  int a,b,c;
  int t1,t2;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  a=in.nextInt();
  b=in.nextInt();
  c=in.nextInt();
  t1=a*b;
  t2=t1%c;
  System.out.println(t2);
 }
}
