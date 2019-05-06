import java.io.*;
import java.util.*;
public class Average
{
 public static void main(String args[])
 {
  int n,x,sum=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int[] a=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=s.nextInt();
    sum=sum+a[i];
   }
  System.out.println(sum/n);
 }
}
