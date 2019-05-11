import java.io.*;
import java.util.*;
public class Printodd
{
 public static void main(String args[])
 {
 int n,rem;
 System.out.println("Input");
 Scanner s=new Scanner(System.in);
 n=s.nextInt();
 while(n>0)
 {
  rem=n%10;
  if(rem%2!=0)
  {
  System.out.print(rem+" ");
  }
  n=n/10;
 }
 }
}
