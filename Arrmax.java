import java.io.*;
import java.util.*;
public class Arrmax
{
 public static void main(String args[])
 {
  int n,max;
  System.out.println("Enter the n value");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
  System.out.println("Enter the array");
   for(int i=0;i<n;i++)
   {
    a[i]=s.nextInt();
   }
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
