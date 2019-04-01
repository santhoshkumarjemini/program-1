import java.io.*;
import java.util.*;
class Vowels
{
 public static void main (String args[])
 {
  boolean isvowel=false;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a character:");
  char ch;
  ch=s.next().charAt(0);
  switch(ch)
   {
     case 'a':
     case 'e':
     case 'i':
     case 'o':
     case 'u':
     case 'A':
     case 'E':
     case 'I':
     case 'O':
     case 'U':isvowel=true;
   }
   if(isvowel==true)
    {
     System.out.println(ch+ "is a vowels");
    }
   else
    {
     if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
      {
        System.out.println(ch+ "is a constant");
      else
        System.out.println("Input is not an alphabet");
      }
    }
 }
}
