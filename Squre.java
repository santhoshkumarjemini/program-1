import java.io.*;
import java.util.*;
public class Squre
{
 public static void main(String args[])
 {
  int a,b,c;
  int flag=0;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  a=in.nextInt();
  b=in.nextInt();
  c=a*b;
   for(int i=1;i<=Math.max(a,b);i++)
   {
     if(i*i==c)
     {
      flag=1;
     }
   }
   if(flag==1)
   {
    System.out.println("Yes");
   }
   else
   {
    System.out.println("No");
   }
 }
}
