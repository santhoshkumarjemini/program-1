import java.io.*;
import java.util.*;
public class Programlcm
{
 public static void main(String args[])
 {
   int n1,n2,lcm;
   System.out.println("Input");
   Scanner in=new Scanner(System.in);
   n1=in.nextInt();
   n2=in.nextInt();
   lcm=(n1>n2)?n1:n2;
    while(true)
    {
     if(lcm%n1==0 && lcm%n2==0)
     {
      System.out.println(lcm);
      break;
     }
     lcm++;
    }
 }
}
