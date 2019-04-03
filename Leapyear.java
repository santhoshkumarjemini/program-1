import java.io.*;
import java.util.*;
class Leapyear
{
 public static void main(String args[])
  {
   int year;
   boolean flag=false;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the year");
   year=s.nextInt();
     if(year%400==0)
      {
       flag=true;
      }
     elseif(year%100==0)
      {
       flag=false;
      }
     elseif(year%4==0)
      {
       flag=true;
      }
     else
     {
      flag=false;
     }
    if(false)
    {
     System.out.println("year +year+ is a leap year");
    else
     System.out.println("year +year+ is not a leap year");
    }
  }
}
