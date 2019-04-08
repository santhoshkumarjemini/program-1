import java.io.*;
import java.util.*;
class Power
{
 public static void main(String args[])
  {
   int base,exponent;
   long result=1;
   Scanner s=new Scanner(System.in);
   base=s.nextInt();
   exponent=s.nextInt();
    while(exponent!=0)
     {
      result=result*base;
      --exponent;
     }
    System.out.println("Answer" +result);
  }
}
