import java.io.*;
import java.util.*;
public class Times
{
  int seconds;
  int minutes;
  int hours;
   public Times(int hours,int minutes,int seconds)
   {
    this.hours=hours;
    this.minutes=minutes;
    this.seconds=seconds;
   }
   public static void main(String args[])
   { 
     Times start=new Times(5,50,0),stop=new Times(4,50,0),diff;
     diff=difference(start,stop);
     System.out.println("Time Difference: %d:%d:%d-",start.hours,start.minutes,start.seconds);
     System.out.println("%d:%d:%d",stop.hours,stop.minutes,stop.seconds);
     System.out.println("=%d:%d:%d\n",diff.hours,diff.minutes,diff.seconds);
   }
   public static Times difference(Time start,Time stop)
   {
    Times diff=new Times(0,0,0);
     if(stop.seconds>start.seconds)
     {
      --start.minutes;
      start.seconds+=60;
     }
     diff.seconds=start.seconds-stop.seconds;
     if(stop.minutes>start.minutes)
     {
      --start.hours;
      start.minutes+=60;
     }
     diff.minutes=start.minutes-stop.minutes;
     diff.hours=start.hours-stop.hours;
     return(diff);
   }
}
