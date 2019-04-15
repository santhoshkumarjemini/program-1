import java.io.*;
import java.util.*;
public class Reverse2
{
 public static void main(string args[])
  {
    int num,rev=0;
    System.out.println("nter a number");
    Scanner s=new Scanner(Syste.in);
    While(num!=0)
    {
     int digit=num%10;
     rev=rev*10+digit;
     num=num/10;
    }
   System.out.println("Reverse "+rev);
  }
}
