import java.io.*;
import java.util.*;
public class Prime
{
 public static void main(String args[])
 {
  int m=0,flag=0;
  int num;
  System.out.println("Enter a number");
  Scanner s=new Scanner(System.in);
  num=s.nextInt();
  m=num/2;
   if(num==0||num==1)
   {
    System.out.println(num+ " is not prime number");
   }
   else
   {
    for(int i=2;i<=m;i++)
     {
      if(num%i==0)
       {
        System.out.println(n+ " is not prime number");
        flag=1;
        break;
       }
      } 
      if(flag==1)
       {
         System.out.println(n+ " is prime number");
       }
     }
   }
 }
}
