import java.io.*;
import java.util.*;
public class Nearest
{
 public static void main(String args[])
 {
  int n=10,m;
  int count=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  m=s.nextInt();
  boolean bool=true;
   while(bool)
   {
    if(m<n)
    {
     count=n;
     bool=false;
    }
    n=n+10;
   }
   System.out.println(count);
 }
}
