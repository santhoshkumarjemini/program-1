import java.io.*;
import java.util.*;
public class Sumnumbers
{
 public static void main(String args[])
 {
  int k,sum=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  k=s.nextInt();
   for(int i=1;i<=k;i++)
   {
    sum=i+sum;
   }
   System.out.println(sum);
 }
}
