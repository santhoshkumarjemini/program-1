import java.io.*;
import java.util.*;
public class Sumofadb
{
 public static void main(String args[])
 {
  int a,d,b,sum=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  a=s.nextInt();
  d=s.nextInt();
  b=s.nextInt();
   for(int i=0;i<b;i++)
   {
    sum=sum+a;
    a=a+d;
   }
   System.out.println(sum);
 }
}
