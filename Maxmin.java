import java.io.*;
import java.util.*;
public class Maxmin
{
 public static void main(String args[])
 {
  int n,min,max;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=s.nextInt();
   }
   min=a[0];
   for(int i=0;i<n;i++)
   {
    if(min>a[i])
    {
     min=a[i];
    }
   }
   System.out.println(+min);
   max=a[0];
   for(int i=0;i<n;i++)
   {
    if(max<a[i])
    {
     max=a[i];
    }
   }
   System.out.println(+max);
 }
}
