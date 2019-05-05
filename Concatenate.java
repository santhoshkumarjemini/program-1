import java.io.*;
import java.util.*;
public class Concatenate
{
 public static void main(String args[])
 {
  String str1,str2;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  str1=in.nextLine();
  str2=in.nextLine();
  System.out.println(str1+""+str2);
 }
}
