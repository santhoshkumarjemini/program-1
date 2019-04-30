import java.io.*;
import java.util.*;
public class Countspace
{
 public static void main(String args[])
 {
  int count=0;
  Scanner in=new Scanner(System.in);
  String s=in.nextLine();
   for(int i=0;i<s.lenght();++i)
   {
    if(s.charAt(i)==' ')
    count++;
   }
  System.out.println(+count);
 }
}
