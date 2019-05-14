import java.io.*;
import java.util.*;
public class Capital
{
 public static String capitalize(String str)
 {
   String words[]=str.split("\\s");
   String capitalize="";
    for(String w:words)
     {
       String first=w.substring(0,1);
       String afterfirst=w.substring(1);
       capitalize+=first.toUpperCase()+afterfirst+" ";
     }
     return capitalize.trim();
 }
 public static void main(String args[])
 {
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  String str=s.nextLine();
  System.out.println(capitalize(str));
 }
}
