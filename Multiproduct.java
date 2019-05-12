import java.io.*;
import java.util.*;
public class Multiproduct
{
 public static void main(String args[])
 {
  int n,d,s=1;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  n=in.nextInt();
   while(n!=0)
   {
    d=n%10;
    s=s*d;
    n=n/10;
   }
   System.out.println(s);
 }
}
