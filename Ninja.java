import java.io.*;
import java.util.*;
public class Ninja
{
 public static void main(String args[])
 {
  int n1,n2,n3;
  int s1,s2,s3;
  int t1,t2,t3;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  n1=in.nextInt();
  n2=in.nextInt();
  s1=in.nextInt();
  s2=in.nextInt();
  t1=in.nextInt();
  t2=in.nextInt();
  n3=n1-n2;
  s3=s1-s2;
  t3=t1-t2;
  System.out.println(Math.abs(n3));
  System.out.println(Math.abs(s3));
  System.out.println(Math.abs(t3));
 }
}
