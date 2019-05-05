import java.io.*;
import java.util.*;
public class Comparestr
{
 public static void main(String args[])
 {
  String str1,str2;
  int s1,s2;
  Scanner in=new Scanner(System.in);
  System.out.println("Input");
  str1=in.nextLine();
  str2=in.nextLine();
  s1=str1.length();
  s2=str2.length();
   if(s1!=s2)
   {
    if(s1>s2)
    {
     System.out.println(str1);
    }
    else
    {
     System.out.println(str2);
    }
   }
   else
   {
    System.out.println(str1);
   }
 }
}
