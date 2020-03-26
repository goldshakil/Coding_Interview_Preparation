package tester;
import java.util.*;
import java.io.*;
class stackQueue
{
	public static void printer()
	{
		System.out.println("-------------------------------------");
	}
  public static void main(String args[])
  {
	  //Stacks
	  Stack<String> stack=new Stack<String>();
	  stack.push("hello");
	  stack.push("world");
	  stack.pop();
	  System.out.println(stack);
	  printer();
	  
	  //Queues -> Normal Queue using linked list implementation
	  Queue<String> queue=new LinkedList<String>();
	  queue.add("hello"); //enqueue
	  queue.add("world");//dequeue
	  queue.remove();
	  System.out.println(queue);
	  printer();
	  //Priority Queue -> Dequeuing based on priority not order
	  Queue<Integer>pQueue=new PriorityQueue<Integer>();
	  pQueue.add(100);
	  pQueue.add(20);pQueue.add(1011);pQueue.add(1100);
	  while(!pQueue.isEmpty())
	  {
		  System.out.println(pQueue.remove()); //Dequeue min value
	  }
	  
	  printer();
	  //Priority Queue with comparator -> Dequeuing based on custome priority not order
	 Comparator<Integer> comparer=new Comparator<Integer>() {
		 @Override
		 public int compare(Integer n1,Integer n2)
		 {
			 if(n2>n1)
			 {
				 return 1;
			 }
			 else if(n2==n1)
			 {
				 return 0;
			 }
			 else
			 {
				 return -1;
			 }
		 }
	};
	  Queue<Integer>pQueue2=new PriorityQueue<Integer>(comparer);
	  pQueue2.add(100);
	  pQueue2.add(20);pQueue2.add(1011);pQueue2.add(1100);
	  while(!pQueue2.isEmpty())
	  {
		  System.out.println(pQueue2.remove());
	  }
	  
	  
	  
	  
	  
	  printer();
	  //Linked List -> not really useful 
	  LinkedList<String> linkedlist=new LinkedList<String>();
	  
	  
	 



  }
}
