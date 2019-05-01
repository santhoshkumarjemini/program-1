import java.io.*;
import java.util.*;
public class Countnum
{
 public static void main()
 {
  Scanner in=new Scanner(System.in);
  String s=in.nextLine();
  int count=0;
  for(int i=0,len=s.length();i<len;i++)
  {
   if(Character.isDigit(s.charAt(i)))
   {
    count++;
   }
  }
  System.out.println(+count);
 }
}
