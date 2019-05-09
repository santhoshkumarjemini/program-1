import java.io.*;
import java.util.*;
public class Minimum
{
 public static void main(String args[])
 {
  int min;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  int[] a=new int[10];
  for(int i=0;i<10;i++)
  {
   a[i]=s.nextInt();
  }
  min=a[0];
  for(int i=0;i<10;i++)
  {
   if(min>a[i])
   {
    min=a[i];
   }
  }
  System.out.println(min);
 }
}
