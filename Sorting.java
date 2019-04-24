import java.io.*;
import java.util.*;
public class Sort
{
 public static void main(String args[])
 {
  int n;
  System.out.println("Enter the Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
     a[i]=s.nextInt();
   }
   for(int i=0;i<n;i++)
   {
     for(int j=i+1;j<n;j++)
     {
       if(a[i]>a[j])
       {
         int temp=a[i];
        a[i]=a[j];
        a[j]=a[i];
       }
     }
   }
  for(int i=0;i<n;i++)
  {
   System.out.println(a[i]+" ");
  }
 }
}
