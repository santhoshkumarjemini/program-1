import java.io.*;
import java.util.*;
public class Printk
{
 public static void main(String args[])
 {
  int n,k;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  k=s.nextInt();
  int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=s.nextInt();
   }
   for(int i=0;i<n;i++)
   {
    if(a[i]==k)
     {
       System.out.println(a[i]);
     }
   }
 }
}
