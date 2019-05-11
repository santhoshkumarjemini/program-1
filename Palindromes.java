import java.io.*;
import java.util.*;
public class Palindromes
{
 public static void main(String args[])
 {
  String str,res="";
  int length;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  str=s.nextLine();
  length=str.length();
   for(int i=length-1;i>=0;i--)
   {
    res=res+str.charAt(i);
   }
   if(str.equals(res))
   {
    System.out.println("Yes");
   }
   else
   {
    System.out.println("No");
   }
 }
}
