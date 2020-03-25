import java.util.*;
import java.io.*;
class arrayFunction
{
  public static void main(String args[])
  {
    //Sorting -> Arrays class
    int a[]={-1,2,4,1,213,512,11,1235,123};
    int b[]={-1,2,4,1,213,512,11,1235,123};
    Arrays.sort(a);
    for(int i=0;i<a.length;i++)
    {
      System.out.printf("%d ",a[i]);
    }

    //Equals
    if(Arrays.equals(a,b))
    {
      System.out.println("\nEQUAL");
    }
    else
    {
      System.out.println("\nNOT");
    }

    //Fill
    Arrays.fill(a,20);
    for(int i=0;i<a.length;i++)
    {
      System.out.printf("%d ",a[i]);
    }
    System.out.println();

    //copyof
    a=Arrays.copyOf(b,b.length);
    for(int i=0;i<a.length;i++)
    {
      System.out.printf("%d ",a[i]);
    }
    System.out.println();

    //copyOfRange
    a=Arrays.copyOfRange(b,3,b.length);
    for(int i=0;i<a.length;i++)
    {
      System.out.printf("%d ",a[i]);
    }

    System.out.println();

    // as list -> static to dynamic
    String ab[] = new String[] { "A", "B", "C", "D" };
    List<String> list = new ArrayList<String>();
    list=Arrays.asList(ab);

    System.out.println("The list is: " + list);


    //to string -> change the full array to string
    String dahab[]={"I ","Dahab","Hello"};
    String fuller=Arrays.toString(dahab);

    System.out.println(fuller);



  }
}
