import java.io.*;
import java.util.*;
public class Countnumdig
{
 public static void main(String args[])
 {
  int n,a=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
   while(n>0)
   {
    n=n/10;
    a++;
   }
   System.out.println(a);
 }
}
