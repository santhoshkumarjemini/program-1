import java.io.*;
import java.util.*;
public class Fibonacci
{
 public static void main(String args[])
 {
  int n,t1=1,t2=1;
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
   for(int i=1;i<=n;++i)
   {
    System.out.println(t1+" ");
    int sum=t1+t2;
    t1=t2;
    t2=sum;
   }
 }
}
