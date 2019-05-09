import java.io.*;
import java.util.*;
public class Binaryrep
{
 public static void main(String args[])
 {
  String s;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  s=in.nextLine();
  int flag=0;
  char ch[]=s.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
     if(ch[i]=='0'||ch[i]=='1')
      {
       flag=2;
      }
      else
      {
      flag=0;
      }
    }
    if(flag==2)
    {
     System.out.println("Yes");
    }
    else
    {
     System.out.println("No");
    }
 }
}
