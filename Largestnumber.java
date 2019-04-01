import java.io.*;
import java.util.*;
class Largestnumber
{
 public static void main(String args[])
  {
   int x,y,z;
   Scanner s=new Scanner(System.in);
   x=s.nextInt();
   y=s.nextInt();
   z=s nextInt();
    if(x>y&&x>z)
     {
      System.out.println("First number is largest");
     }
    elseif(y>x&&y>z)
    { 
     System.out.println("Second number is largest");
    }
    elseif(z>x&&z>y)
    {
     System.out.println("Third number is largest");
    }
    else
    {
     System.out.println("The number is distinct");
    }
  }
}
