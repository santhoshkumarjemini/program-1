import java.io.*;
import java.util.*;
public class Gcd
{
 public static void main(String args[])
 {
  int n1,n2,gcd=1;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n1=s.nextInt();
  n2=s.nextInt();
   for(int i=1;i<=n1&&i<=n2;i++)
   {
    if(n1%i==0 && n2%i==0)
    {
     gcd=i;
    }
   }
   System.out.println(gcd);
 }
}
