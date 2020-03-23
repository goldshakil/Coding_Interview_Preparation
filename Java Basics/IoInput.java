import java.io.*;
import java.util.*;
class IoInput
{
  public static void main(String[] args)
  {
    //File Scanning
    Scanner sc=null;
    try
    {
      File file=new File("Tester.txt");
      sc=new Scanner(file);
    }catch(Exception E)
    {
      System.out.println("Failed");
    }

    while(sc.hasNextInt()) //hasNextLine for full line
    {
      System.out.println(sc.nextInt()); //nextLine
    }
    //Command Line Scanning
    Scanner commandScanner=new Scanner(System.in);
    System.out.println(commandScanner.nextInt());
  }

}
