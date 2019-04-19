import java.io.*;
import java.util.*;
public class Primes
{
 public static void main(String args[])
 {
  int start,end;
  System.out.println("Enter the Input");
  Scanner s=new Scanner(System.in); 
  start=s.nextInt();
  end=s.nextInt();
  start=start+1;
    while(start<end)
    {
      boolean flag=false;
       for(int i=2;i<=start/2;i++)
        {
         if(start%i==0)
          {
           flag=true;
           break;
          }
        }
       if(!flag)
       {
        System.out.println(start+ " ");
       }
      start++;
    }
 }
}
