import java.io.*;
import java.util.*;
public class Alphanumeric
{
 public static void main(String args[])
 {
  String str;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  str=in.nextLine();
  char ch[]=str.toCharArray();
   for(int i=0;i<ch.length;i++)
   {
    if(Character.isDigit(str.charAt(i)))
    {
     System.out.print(ch[i]);
    }
   }
 }
}
