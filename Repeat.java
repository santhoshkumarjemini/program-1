import java.io.*;
import java.util.*;
public class Repeat
{
 public static void main(String args[])
 {
  int n,k,count=0;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  n=in.nextInt();
  k=in.nextInt();
  int[] a=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=in.nextInt();
   }
   for(int i=0;i<n;i++)
   {
    if(a[i]==k)
    {
     count++;
    }
   }
  System.out.println(count);
 }
}
