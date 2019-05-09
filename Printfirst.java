import java.io.*;
import java.util.*;
public class Printfirst
{
 public static void main(String args[])
 {
 int n;
 String str;
 System.out.println("Input");
 Scanner s=new Scanner(System.in);
 str=s.nextLine();
 n=s.nextInt();
  for(int i=0;i<n;i++)
  {
   System.out.println(str.charAt(i));
  }
 }
}
