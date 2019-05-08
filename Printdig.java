import java.io.*;
import java.util.*;
public class Printdig
{
 public static void main(String args[])
  {
   int number;
   System.out.println("Input");
   Scanner s=new Scanner(System.in);
   number=s.nextInt();
   Printdig p=new Printdig();
   p.recursion(number);
 }
 public static void recursion(int number)
 {
   if(number>0)
   {
    recursion(number/10);
    System.out.print(" "+(number%10));
   }
  }
 }
