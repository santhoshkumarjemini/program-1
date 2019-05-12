import java.io.*;
import java.util.*;
public class Join
{
 public static void main(String args[])
 {
  int n1,n2;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  n1=in.nextInt();
  n2=in.nextInt();
  String s1=Integer.toString(n1);
  String s2=Integer.toString(n2);
  String con=s1+s2;
  int res=Integer.parseInt(con);
  System.out.println(res);
 }
}
