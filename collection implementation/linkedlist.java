import java.util.Scanner;
class Linked
{
  Node head;
  class Node
  {
    int data;
    Node next;
    Node(int val)
    {
      data=val;
      next=null;
    }
   }
   linked()
   {
     head=null;
   }
   public void insertbegin(int val)
   {
     Node newnode=new Node(val);
     if(head==null)
     {
     head=newnode;
     }
     else
     {
       newnode.next=head;
       head=newnode;
     }
     
    }
    public void add(int val)
    {
    	
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
    public void insertatpos(int pos,int val)throws 
    {
       Node newnode=new Node(val);
       Node temp=head;
       if(pos==0)
       {
         insertbegin(val);
         return;
       }
       
       for(int i=1;i<pos;i++)
       {
       if(temp.next==null)
       {
            throw new IndexOutOfBoundsException("Invalid Position: " );

       }
         temp=temp.next;
       }
       newnode.next=temp.next;
       temp.next=newnode;
    }
    public void delete(int pos)
    {
      Node temp=head;
       Node prev=null;
  
       if(pos==0)
       {
      head=head.next;
       }
     
     else
     {
       for(int i=1;i<=pos;i++)
       {
         prev=temp;
         temp=temp.next;
       }
      prev.next=temp.next;
    }
  }
 public void get(int index)
 {
   Node temp=head;
   for(int i=1;i<=index;i++)
   {
     if(i==index)
     {
       System.out.println(temp.data+" ");
       break;
     }
     temp=temp.next;
   }
  }
  public void update(int index,int element)
  {
    Node temp=head;
    for(int i=1;i<=index;i++)
    {
      if(i==index)
      {
        temp.data=element;
      }
      temp=temp.next;
    }
  }
  public void deleteatend()
  {
    Node temp=head;
    Node prev=null;

    while(temp.next!=null)
    {
      prev=temp;
      temp=temp.next;
      if(temp.next==null)
      {
        prev.next=null;
        break;
      }
    }
  }
  public void insertatend(int val)
  {
    Node newnode=new Node(val);
    Node temp=head;
    while(temp.next!=null)
    {
      
      temp=temp.next;
    }
    temp.next=newnode;
  }
  public void search(int val)
  {
    Node temp=head;
    int i=0,count=0;
          int index=0;
    while(temp.next!=null)
    {
      temp=temp.next;
      i++;

      if(temp.data==val)
      {
         count++;
         index=i;
         break;
      }
    }
  
      if(count!=0)
      {
        System.out.println("It is present in :"+index);
      }
      else
      {
        System.out.println("It is not present");
      }
   }
public String toString(){
	display();
	return "T";
}
  
        
  
     
}
class demo
{
  public static void main(String[] args)
  {
     linked l=new linked();

     Scanner ob=new Scanner(System.in);
     while(true)
     {
     System.out.println("=========================================================");
     System.out.println("1.Insert an element");
     System.out.println("2.Display");
     System.out.println("3.Insert the element at the specified position");
     System.out.println("4.Delete at the specified position");
     System.out.println("5.Get the element:");
     System.out.println("6.update the element");
     System.out.println("7.insert at end");
     System.out.println("8.Delete at end"); 
     System.out.println("Exit");
     System.out.println("10.Search an element");
     System.out.println("=========================================================");
     System.out.println("Enter the choice");
     int choice=ob.nextInt();
     System.out.println("=========================================================");
     switch(choice)
     {
       case 1:
          System.out.println("Enter the element:");
          int val=ob.nextInt();
          l.insertbegin(val);
          break;
       case 2:
           System.out.println("The element is:" + l);         
            break;
        case 3:
            System.out.println("Enter the position to be added");
            int pos=ob.nextInt();
            System.out.println("Enter the element to be inserted:");
            int element=ob.nextInt();
            l.insertatpos(pos,element);
            break;
        case 4:
               System.out.println("Enter the position to be deleted :");
               int position=ob.nextInt();
               l.delete(position);
               break;
        case 5:
              System.out.println("Enter the index to identify element");
              int ind=ob.nextInt();
              l.get(ind);
              break;
        case 6:
              System.out.println("Enter the index to be updated :");
              int in=ob.nextInt();
              System.out.println("Enter the element :");
              int ele=ob.nextInt();
              l.update(in,ele);
              break;
        case 7:
              System.out.println("Enter the element:");
              int va=ob.nextInt();
              l.insertatend(va);
              break;
        case 8:
               l.deleteatend();
               break;
            
        case 9:
           System.exit(0);
           break;
        case 10:
           System.out.println("Enter the element to be searched:");
           int element1=ob.nextInt();
           l.search(element1);
           break;
         default:
            System.out.println("Invalid choice");
            break;
       }
       
        
   }
       
}
}
   
   

      
