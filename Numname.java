import java.io.*;
import java.util.*;
public class Numname
{
 public static void main(String args[])
 {
  int n;
  System.out.println("Input");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
  String name[]={" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
  System.out.println(name[n]);
 }
}
