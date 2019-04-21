import java.io.*;
import java.util.*;
public class Arraysort
{
 public static void main(String args[])
 {
  int n;
  System.out.println("Enter the n value");
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
           a[j]=temp;
        }
      }
     }
    for(int i=0;i<n;i++)
    {
     System.out.println(a[i]+ " ");
    }
 }
}
