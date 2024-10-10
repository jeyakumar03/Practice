class HashMap<k,v>{
	private HashNode[] buckets;
	private int size;
	private int noofbuckets;
	private Node head;
	private class HashNode<k,v>{
		k key;
		v value;
		HashNode next;
		HashMap(k key, v value){
			this.key=key;
			this.value=value;
			next=null;
		}
		HashMap(){
			this(10);
		}
		HashMap(int capacity){
			noofbuckets=capacity;
			buckets=new HashNode[capacity];
			size=0;
			head=null;
		}
		private class Node<k>{
			k data;
			Node next;
			Node(){
				this.data
			}
		}
		
		
	}
	
}


