import java.util.Scanner;
import java.util.Arrays;
class queueimplementation
{
  int[] ar;
  int maxsize=10;
  int front,rear;
queueimplementation()
  {
    front=-1;
    rear=-1;
    ar=new int[maxsize];
  }
  public void enqueue(int val)
  {
     if(front==-1) 
     front++;
     if(rear>maxsize)
         System.out.println("Out bounds exception");
     ar[++rear]=val;
   }
   
  public int dequeue()
  {
    if(front>rear)
    {
      System.out.println("Queue element is null");
    }
    if(front==-1)
    {
       System.out.println("Queue is empty");
    }
    int temp=ar[0];
    for(int i=1;i<=rear;i++)
    {
      ar[i-1]=ar[i];
      ar[i]=0;
    }
    rear--;
    return temp;
  }

  
 public void display()
 {
   System.out.print("[");
    for(int i=front;i<maxsize;i++)
    {
       System.out.print(ar[i]+" ");
    }
    System.out.print("]");
    System.out.println();
 }
}
class sample
{
  public static void main(String[] args)
  {
     queueimplementation s=new queueimplementation();
     s.enqueue(8);
     s.enqueue(10);
     s.enqueue(100);
     s.enqueue(110);
     s.display();
    // s.dequeue();
     //s.dequeue();
     //s.dequeue();     
     s.dequeue();  
     s.dequeue();                  
     s.display();
     s.enqueue(80);
     s.display();
  }
}
     
     
     
  
