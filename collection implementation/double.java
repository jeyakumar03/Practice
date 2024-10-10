class Double{
	Node head;
	Node tail;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int val){
			data=val;
			next=null;
			prev=null;
		}
		
	}
	Double(){
		head=null;
		tail=null;
	}
	public void insertAtBegin(int val){
		Node newnode=new Node(val);
		newnode.next=head;
		if(head==null){
			tail=newnode;
			
		}
		else{

			head.prev=newnode;

		}
		head=newnode;
	}
	public void deleteAtFirst(){
		if(head==null){
			System.out.println("List is empty");
		}
		else{
		head=head.next;
		head.prev=null;
		}
	}
	public void display(){
		Node temp=head;
		while(temp!=null){
		 System.out.print(temp.data+" ");
		 temp=temp.next;
		}
		System.out.println();
	}
	public void insertAtPosition(int index,int val){
 		Node newnode=new Node(val);
		if(index==0){
			insertAtBegin(val);
		}
		Node temp=head;
		for(int i=1;i<index;i++){
			temp=temp.next;
			
		}
		newnode.prev=temp;
		newnode.next=temp.next;
		temp.next.prev=newnode;
		temp.next=newnode;
	}
	
}
class Demo{
	public static void main(String[] args){
		Double list=new Double();
		list.insertAtBegin(10);
		list.insertAtBegin(100);
		list.insertAtBegin(300);
		list.insertAtBegin(400);
		list.display();
		list.deleteAtFirst();
				list.display();
		list.insertAtPosition(2,200);
		list.display();
		
	}
}
