import java.io.*;
import java.util.*;
public class Odd
{
 public static void main(String args[])
  {
   int n1,n2;
   System.out.println("Enter the number");
   Scanner s=new Scanner(System.in);
   n1=s.nextInt();
   n2=s.nextInt();
   n1=n1+1;
    while(n1<n2)
    {
     if((n1%2)!=0)
      {
       System.out.println(n1+ " ");
      }
     n1++;
    }
  }
}
