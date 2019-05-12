import java.io.*;
import java.util.*;
public class Printindex
{
 public static void main(String args[])
 {
  int n,find=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
    a[i]=s.nextInt();
   }
   for(int i=0;i<n-1;i++)
   {
    if(a[i]>a[i+1])
    {
     find=i-1;
     i=n-1;
    }
   }
   System.out.println(a[find]);
 }
}
