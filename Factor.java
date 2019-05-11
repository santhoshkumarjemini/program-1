import java.io.*;
import java.util.*;
public class Factor
{
 public static void main(String args[])
 {
  int n;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
   for(int i=1;i<=n;i++)
   {
    if(n%i==0)
    {
     System.out.print(i+" ");
    }
   }
 }
}
