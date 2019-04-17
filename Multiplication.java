import java.io.*;
import java.util.*;
public class Multiplication
{
 public static void main(String args[])
  {
    int n,i=1;
    System.out.println("Enter the input");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    while(i<=5)
    {
     System.out.println(n*i+" ");
     i++;
    }
  }
}
