import java.io.*;
import java.util.*;
public class Substring 
{
public static void main(String args[])
 {
  String str;
  int n;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  str=s.nextLine();
  n=s.nextInt();
  int len=str.length();
  int find=len-n;
  System.out.println(str.substring(find,len));
 }
}
