import java.io.*;
import java.util.*;
public class Countline
{
 public static int countLine(String text)
 {
  return text.split("[\n|\r]").length;
 }
 public static void main(String args[])
 {
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  int count=countLine(s.nextLine());
  System.out.println(count);
 }
}
