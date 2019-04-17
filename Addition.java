import java.io.*;
import java.util.*
public class Addition
{
 public static void main(String args[])
 {
  int n,k,result=0;
  int N[]=new int[5];
  System.out.println("Enter the values n and k");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  k=s.nextInt();
  System.out.println("Enter the Array");
   for(int i=0;i<n;i++)
   {
    N[i]=s.nextInt();
   }
   for(int i=0;i<k;i++)
   {
    result=result+N[i];
   }
  System.out.println("result " +result );
  }
}
