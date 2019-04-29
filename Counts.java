import java.io.*;
import java.util.*;
public class Counts
{
 public static void main(String args[])
  {
   System.out.println("Enter the Input");
   Scanner s=new Scanner(System.in);
   String input=s.nextLine();
   String str=input;
   String myString[]=str.split(" ");
   int length=str.length();
   System.out.println(length);
  }
}
