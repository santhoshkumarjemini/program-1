import java.io.*;
import java.util.*;
public class Countw
{
 public static void main()
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a sentence");
  String sentence=s.nextLine();
  System.out.println(countWords(sentence));
 }
 public static int countWords(String str)
 {
  int count=1;
  for(int i=0;i<=str.length()-1;i++)
   {
    if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
    {
     count++;
    }
   }
   return count;
}
