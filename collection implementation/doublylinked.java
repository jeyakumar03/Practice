import java.util.Scanner;
public class doublylinked<T>
{

  Node head;
  Node tail;
  class Node
  {
    T data;
  Node prev;
  Node next;
  Node(T val)
  {
    data=val;
    head=null;
    prev=null;
    
  }
 }
 doublylinked()
 {
   head=null;
   tail=null;
 }
 public void insertatbegin(T val)
 {
   Node newnode=new Node(val);
   if(head==null)
   {
     head=newnode;
     tail=newnode;
   }
   else
   {
      head.prev=newnode;
      newnode.next=head;
      head=newnode;
   }
 }
 public void display()
    {
     Node temp=head;
     while(temp!=null)
     {
       System.out.print(temp.data+" ");
       temp=temp.next;
     }
     System.out.println();
    }
public void displayrev()
    {
     Node temp=head;
     while(temp!=null)
     {
       System.out.print(temp.data+" ");
       temp=temp.prev;
     }
     System.out.println();
    }

}
class demo
{
public static void main(String[] args)
 {
    doublylinked d=new doublylinked();
   Scanner ob=new Scanner(System.in);
  while(true)
  {
    System.out.println("1.Insert an element");
    System.out.println("2.Display the list");
    System.out.println("3.Display in reverse order");
    System.out.println("Enter the choice");
    int choice=ob.nextInt();
  
 switch(choice)
 {
   case 1:
      System.out.println("Enter the element to be added");
      int val=ob.nextInt();
      d.insertatbegin(val);
       break;
   case 2:
     d.display();
     break;
   case 3:
      d.displayrev();
      break;
   default:
      System.out.println("invalid choice");
      break;
       
 }
}   
}
}
     
