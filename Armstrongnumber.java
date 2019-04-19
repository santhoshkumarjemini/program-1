import java.io.*;
import java.util.*;
public class Armstrongnumber
{
 public static void main(String args[])
  {
   int num1,num2;
   System.out.println("Enter the Input");
   Scanner s=new Scanner(System.in);
   num1=s.nextInt();
   num2=s.nextInt();
     for(int i=num1;i<num2;i++)
     {
      int check=i,dig,sum=0;
      while(check!=0)
      {
       dig=check%10;
       sum=sum+(dig*dig*dig);
       check=check/10;
      }
      if(sum==i)
      {
       System.out.println(i+" ");
      }
     }
  }
}
