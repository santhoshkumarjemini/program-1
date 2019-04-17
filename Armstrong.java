import java.io.*;
import java.util.*;
public class Armstrong
{
 public static void main(String args[])
  {
   int c=0,temp;
   int n;
   System.out.println("Enter the number");
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   temp=n;
    while(n!=0)
     {
      int d=n%10;
      c=c+(d*d*d);
      n=n/10;
     }
     if(temp==n)
     {
      System.out.println("Yes");
     else
      System.out.println("No");
     }
  }
}
