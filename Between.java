import java.io.*;
import java.util.*;
public class Between
{
 public static void main(String args[])
 {
  int n,l,r;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  l=s.nextInt();
  r=s.nextInt();
  if((l<=n)&&(r>=n))
  {
   System.out.println("Yes");
  }
  else
  {
   System.out.println("No");
  }
 }
}
