import java.io.*;
import java.util.*;
public class Composite
{
 public static void main(String args[])
 {
  int n,count=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  for(int i=1;i<=n;i++)
  {
   if(n%2==0)
   {
    count++;
   }
  }
  if(count>2)
  {
   System.out.println("Yes");
  }
  else
  {
   System.out.println("No");
  }
 }
}
