import java.io.*;
import java.util.*;
public class Lexicographical
{
 public static void main(String args[])
 {
  String str;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  str=s.nextLine();
  char ch[]=str.toCharArray();
  Arrays.sort(ch);
   for(int i=0;i<ch.length;i++)
   {
    System.out.print(ch[i]);
   }
 }
}
