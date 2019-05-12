import java.io.*;
import java.util.*;
public class Squres
{
 public static void main(String args[])
 {
  int n,k,res=0;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  n=in.nextInt();
  k=in.nextInt();
  res=n^k;
  System.out.println(res);
 }
}
