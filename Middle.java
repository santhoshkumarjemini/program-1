import java.io.*;
import java.util.*;
public class Middle
{
 public static void main(String args[])
 {
  String str;
  int length,mid;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  str=s.nextLine();
  length=str.length();
  char ch[]=str.toCharArray();
   if(length%2!=0)
   {
    mid=length/2;
    ch[mid]='*';
   }
   else
   {
    mid=length/2;
    ch[mid-1]='*';
    ch[mid]='*';
   }
   for(int i=0;i<length;i++)
   {
    System.out.print(ch[i]);
   }
 }
}
