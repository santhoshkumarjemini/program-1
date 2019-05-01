import java.io.*;
import java.util.*;
public class Countspecial
{
 public static void main(String args[])
 {
  String str;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  str=in.nextLine();
  int upper=0,lower=0,number=0,special=0;
   for(int i=0;i<str.length();i++)
    {
     char ch=str.charAt(i);
      if(ch>='A'&&ch<='Z')
         upper++;
      else if(ch>='a'&&ch<='z')
         lower++;
      else if(ch>='0'&&ch<='9')
         number++;
      else
         special++;
    }
    System.out.println(+special);
 }
}
