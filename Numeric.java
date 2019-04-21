import java.io.*;
import java.util.*;
public class Numeric
{
 public static void main(String args[])
 {
  String str;
  boolean numeric=true;
  System.out.println("Enter the input");
  Scanner s=new Scanner(System.in);
  str=s.nextLine();
   try
   {
    Double num=Double.parseDouble(str);
   }
  catch(NumberFormateException e)
   {
    numeric=false;
   }
   if(numeric)
   {
    System.out.println("Yes");
   }
   else
   {
    System.out.println("No");
   }
 }
}
