import java.io.*;
import java.util.*;
public class Arrmin
{
  public static void main(String args[])
   {
     int n,min;
     System.out.println("Enter the Input");
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the array");
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
   }
}
