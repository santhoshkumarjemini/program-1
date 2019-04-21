import java.io.*;
import java.util.*;
public class Time
{
 public static void main(String args[])
 {
  int sec;
  int s,h,m;
  System.out.println("Enter the seconds");
  Scanner s=new Scanner(System.in);
  sec=s.nextInt();
  s=sec%60;
  h=sec/60;
  m=h%60;
  h=h/60;
  System.out.println(m+" "+s);
 }
}
