import java.io.*;
import java.util.*;
public class Contain
{
 public static void main(String args[])
 {
  int count=0;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  String s=in.nextLine();
   for(int i,len=s.length();i<len;i++)
   {
    if(Character.isDigit(s.charAt(i)))
    {
     count++;
    }
   }
  if(count>0)
  {
   System.out.println("Yes");
  }
  else
  {
   System.out.println("No");
  }
 }
}
