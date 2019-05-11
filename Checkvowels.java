import java.io.*;
import java.util.*;
public class Checkvowels
{
 public static void main(String args[])
 {
  String str;
  int count=0;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  str=s.nextLine();
  char ch[]=str.toCharArray();
  for(int i=0;i<ch.length;i++)
  {
   if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
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
