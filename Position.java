import java.io.*;
import java.util.*;
public class Position
{
 public static void main(String args[])
 {
  String str;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  str=s.nextLine();
  char ch[]=str.toCharArray();
  int len=ch.length;
   for(int i=0;i<len;i++)
   {
    System.out.print(ch[i]);
    i++;
   }
   System.out.print(" ");
   for(int i=1;i<len;i++)
   {
    System.out.print(ch[i]);
    i++;
   }
 }
}
