class linked<T>{
	Node head;

	Node tail;
        
	class Node{
		T data;
		Node next;
	        Node prev;
		Node(T val){
			data=val;
			next=null;
			prev=null;
		}
		}
	
	linked(){
		head=null;
		tail=null;
	}
	public void add(T val){
		Node newnode=new Node(val);
		if(head==null){
			head=newnode;
			tail=newnode;
		}
		else{
			newnode.next=head;
			head.prev=newnode;
			head=newnode;

		}	
	}
	public void delete(){
	Node temp=head;
	if(temp==null){
		System.out.println("List is empty");
	}
	else{
		temp=temp.next;
		head=temp;
		head.prev=null;
		
	}
	}
	public void display(){
	
	System.out.println();
	}
	public String toString(){
		String s="";
		Node temp=head;
	while(temp!=null){
		s=s+temp.data+",";
		temp=temp.next;
	}
		return s;
	}
}

class execute{
	public static void main(String[] args){
		linked s=new linked();
		s.add(23);
		s.add(100);
		s.display();
		//s.delete();
		//s.display();
		System.out.println(s);
	}
}
