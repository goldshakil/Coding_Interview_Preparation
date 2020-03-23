import java.util.*;
import java.io.*;
// length can be used for int[], double[], String[]
// to know the length of the arrays.

// length() can be used for String, StringBuilder, etc
// String class related Objects to know the length of the String

//Static methods no need to create an instance of their Class
//Instance mehotd (normal )-> need to create instance of their class
class arrayClassFunctionsCommandLine
{
  public static void main(String args[])
  {

    //Command Line
    System.out.println(args.length); //number of inputs  (size of array)
    System.out.println(args[2].length());
    printer();
    //Array
    Scanner sc=null;
    try{
      File file=new File("tester.txt");
      sc=new Scanner(file);
    }catch(Exception e)
    {
      System.out.println("Error");
    }
    int rows=sc.nextInt();
    int clms=sc.nextInt();
    int a[][]=new int[rows][clms];
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<clms;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[0].length;j++)
      {
        System.out.printf("%d ",a[i][j] );
      }
      System.out.println();
    }
    printer();
    //String splitting
    String b="Hello My Name is Dahab";
    String collection[]=b.split(" ");
    for(int i=0;i<collection.length;i++)
    {
      System.out.println(collection[i]);
    }
    printer();
    //String to Int and Vice Versa
    System.out.println("Converter");
    int q=12;
    String d=Integer.toString(q);
    System.out.println(d);
    String z="123";
    q=Integer.parseInt(z);
    System.out.println(q);
    printer();
    //Class test
    student std1=new student();
    std1.setter(12,"Dahab");
    System.out.println(std1.name);  System.out.println(std1.age);
    printer();

    
    //array of class
    student list[]=new student[3];
    list[0]=new student();
    list[0].setter(50,"Jiyeon");
    list[1]=new student();
    list[1].setter(12,"Daerim");
    list[2]=new student();
    list[2].setter(30,"Irene");
  }

  static void printer()
  {
    System.out.println("---------------------------------------------------");
  }


}

class student
{
  int age;
  String name;
  void setter(int age,String name)
  {
    this.age=age;
    this.name=name;
  }

}
