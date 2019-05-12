import java.io.*;
import java.util.*;
public class Divisible
{
 public static void main(String args[])
 {
  int n,res=0;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  n=in.nextInt();
  while(n!=1)
  {
   if(n%2!=0)
   {
    res=n;
    break;
   }
   n=n/2;
  }
  System.out.println(n);
 }
}
