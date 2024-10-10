 class DoubleLinkedList
{
  Node head;
  Node tail;
  int size;
  class Node
  {
     int data;
     Node next;
     Node prev;
   Node(int val)
   {
     data = val;
     next=null;
     prev=null;
    }
  }
    DoubleLinkedList()
    {
      head=null;
       tail=null;
    }
  
   public void insertAtBegin(int val)
   {
      Node newnode=new Node(val);
      newnode.next=head;
        if(head==null)
        {
          tail=newnode;
        }
        else
        {
          head.prev=newnode;
        }
       head=newnode;
       size++;
    }
    public void display()
    {
     Node temp=head;
      if(temp==null)
      {
         System.out.println("List is empty");
      }
       while(temp!=null)
       {
         System.out.print(temp.data+"  ");
         temp=temp.next;
       }
       System.out.println();
    }
    public void displayRev(){
      Node temp=tail;
      if(tail==null){
      	System.out.println("List is empty");
     }
     while(temp!=null){
       System.out.print(temp.data+"  ");
       temp=temp.prev;
     }
     System.out.println();	
    }
    public void insertAtPosition(int index,int val){
      Node newnode=new Node(val);
      Node temp=head;
      if(index==0){
      	insertAtBegin(val);
      	return;
      }
      	for(int i=1;i<index;i++){
	   temp=temp.next;
	}
	newnode.prev=temp;
	newnode.next=temp.next;
	temp.next.prev=newnode;
	temp.next=newnode;
     }
     public void insertAtEnd(int val){
       Node newnode=new Node(val);
       Node temp=tail;
       if(temp==null){
          tail=newnode;
       }
       else{
         newnode.prev=tail;
         tail.next=newnode;
       }
       tail=newnode;
       size++;
     }
     public void deleteAtfirst(){
        Node temp=head;
        if(head==null){
          head=null;
          tail=null;
        }
        else
        {
          head=temp.next;
          head.prev=null;
        }
        size--;
     }
     public void searchElement(int val){
        Node temp=head;
        if(temp==null){
          System.out.println("List is empty");
          return;
        }
        if(temp.data==val){
           System.out.println("It is present at the first");
           return;
        }
        for(int i=0;i<=size;i++){
           if(temp.data==val){
              System.out.println("It is present at the position:"+(i+1));
              return;
           }
           temp=temp.next;
        }
        System.out.println("It is not in the list");
        
      }
      public void deleteAtLast(){
        Node temp=head;
        if(head==tail){
        	head=null;
        	tail=null;
        	return;
        }
        tail=tail.prev;
        tail.next=null;
      }
        
           
        
     
          
       
       
       
       
	   
 }
 class demo
 {
   public static void main(String[] args)
   {
      DoubleLinkedList list=new DoubleLinkedList();
      list.insertAtBegin(100);
      list.insertAtBegin(20);
      list.display();
      list.displayRev();
      list.insertAtPosition(1,30);
      list.display();
      list.insertAtEnd(200);
      list.display();  
      list.deleteAtfirst();
      list.display(); 
      list.searchElement(200); 
      list.deleteAtLast();
      list.display(); 
    
      
   }
}
     
      
     
