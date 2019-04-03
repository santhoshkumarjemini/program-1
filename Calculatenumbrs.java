import java.io.*;
import java.util.*;
class Calculatenumbrs
{
 public static void main(String args[])
  {
   int x,i=1;
   int sum=0;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the number of items");
   x=s.nextInt();
   while(i<=x)
   {
    sum=sum+i;
    i++;
   }
   System.out.println("sum of "+x+" number is" +sum+);
  }
}
