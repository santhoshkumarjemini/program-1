import java.io.*;
import java.util.*;
public class Primenum
{
 public static void main(String args[])
 {
  int n,m=0,flag=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  m=n/2;
  if(m==0||m==1)
  {
   System.out.println("No");
  }
  else
  {
   for(int i=2;i<m;i++)
   {
    if(m%2==0)
    {
     System.out.println("No");
     flag=1;
     break;
    }
    if(flag==1)
    {
     System.out.println("Yes");
    }
   }
  }
 }
}
