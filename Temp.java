import java.io.*;
import java.util.*;
public class Temp
{
 public static void main(String args[])
 {
  int c;
  System.out.println("Input");
  Scanner in=new Scanner(System.in); 
  c=in.nextInt();
  float kel=c+273.15f;
  System.out.println(Math.round(kel));
 }
}
