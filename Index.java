import java.io.*;
import java.util.*;
public class Index
{
 public static void main(String args[])
 {
  int n;
  System.out.println("Enter the input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
   a[i]=s.nextInt();
  }
  for(int i=0;i<n;i++)
  {
   System.out.println(a[i]+" "+i);
  }
 }
}
