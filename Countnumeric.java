import java.io.*;
import java.util.*;
public class Countnumeric
{
 public static void main(String args[])
 {
  int num,count=0;
  System.out.println("Input");
  Scanner in=new Scanner(System.in);
  num=in.nextInt();
   while(num!=0)
   {
    num=num/10;
    count++;
   }
   System.out.println(count);
 }
}
