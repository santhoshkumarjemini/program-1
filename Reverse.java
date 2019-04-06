import java.io.*;
import java.util.*;
class Reverse
{
 public static void main(String args[])
 {
  String original,reverse="";
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a String");
  original=s.nextLine();
  int length=original.length();
   for(int i=length-1;i>=0;i--)
   {
    reverse=reverse+original.charAt(i);
   }
   System.out.println("Reverse String is "+reverse);
 }
}
