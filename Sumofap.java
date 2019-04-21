import java.io.*;
import java.util.*;
public class Sumofap
{
 public static void main(String args[])
 {
  int N,A,D,sum=0;
  System.out.println("Enter the Input");
  Scanner s=new Scanner(System.in);
  N=s.nextInt();
  A=s.nextInt();
  D=s.nextInt();
  sum=N*(2*A+(N-1)*D)/2;
  System.out.println(+sum);
 }
}
