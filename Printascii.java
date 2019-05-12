import java.io.*;
import java.util.*;
public class Printascii
{
 public static void main(String args[])
 {
  char ch;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  ch=s.next().charAt(0);
  int ascii=ch;
  System.out.println(ascii);
 }
}
