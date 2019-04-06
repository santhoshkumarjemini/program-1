import java.io.*;
import java.util.*;
class Count
{
 public static void main(String args[])
 {
  int no,a=0;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number");
  no=s.nextInt();
   if(no<0)
   {
    no=no*-1;
   }
   else if(no==0)
   {
    no=1;
   }
   while(no>0)
   {
    no=no/10;
    a++;
   }
   System.out.println("Number of Digit is" +a);
 }
}
