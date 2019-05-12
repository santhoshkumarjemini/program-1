import java.io.*;
import java.util.*;
public class Isogram
{
 public static void main(String args[])
 {
  String str;
  int flag=0;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  str=in.nextLine();
  char ch[]=str.toCharArray();
  int len=ch.length;
   for(int i=0;i<len;i++)
   {
    for(int j=1;j<i;j++)
    {
     if(ch[i]==ch[j])
     {
      flag=1;
     }
    }
   }
   if(flag==1)
   {
    System.out.println("No");
   }
   else
   {
    System.out.println("Yes");
   }
 }
}
