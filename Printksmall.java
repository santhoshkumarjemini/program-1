import java.io.*;
import java.util.*;
public class Printksmall
{
 public static void main(String args[])
 {
  int n,k;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  n=in.nextInt();
  k=in.nextInt();
  int[] a=new int[n];
   for(int i=0;i<n;i++)
   {
     a[i]=in.nextInt();
   }
   System.out.println(a[k-1]);
 }
}
