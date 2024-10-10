import java.util.Scanner;
class BinarySearchTree{
	Node root;
	class Node{
		Node left,right;
		int data;
	        Node(int val){
	          data=val;
	          left=right=null;
	        }
	  }
	 public BinarySearchTree(int val){
	 	root=new Node(val);
	 }
	 public BinarySearchTree(){
	 	root=null;
	 }  
	 public void insert(int val){
	 	insert(root,val);
	 }    
	public Node insert(Node root,int val){
		if(root==null)
			return new Node(val);
		if(val<root.data){
			root.left=insert(root.left,val);
		}
		else{
			root.right=insert(root.right,val);
		}
		return root;
	}
	public void inOrder(Node root){
		if(root!=null){
	
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public void postOrder(Node root){
		if(root!=null){
		  postOrder(root.left);
		  postOrder(root.right);
		  System.out.print(root.data+" ");
		}	
	}
	public Node search(Node root,int val){
		if(root==null || root.data==val){
			return root;
		}
		if(val<root.data){
			return search(root.left,val);
		}
		return search(root.right,val);
	}
	public Node delete(Node root,int val){
		if(root==null){
			return root;
		}
		if(val<root.data){
			root.left=delete(root.left,val);
		}
		else if(val>root.data){
			root.right=delete(root.right,val);
		}
		else{
			if(root.left==null){
				return root.right;
			}
			else if(root.right==null){
				return root.left;
			}
			root.data=min(root.right);
			root.right=delete(root.right,root.data);
		}
		return root;
	}	
	public int min(Node root){
		int minVal=root.data;
		while(root.left!=null){
			minVal=root.left.data;
			root=root.left;
		}
		return minVal;
	}
}
class Demo{
	public static void main(String[] args){
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the number of element");
		int n=ob.nextInt();
		System.out.println("Enter the root element");
		int root=ob.nextInt();
		BinarySearchTree bst=new BinarySearchTree(root);
		int[] ar=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++){
			ar[i]=ob.nextInt();
		}	
		for(int i=0;i<n;i++){
			bst.insert(ar[i]);
		}	
		bst.inOrder(bst.root);
		System.out.println();
		bst.postOrder(bst.root);
		System.out.println();
		System.out.println("Enter the element to be searcH");
		int sea=ob.nextInt();
		if(bst.search(bst.root,sea)==null){
			System.out.println("Not found");}
		else{
			System.out.println("Found");
		}
		bst.delete(bst.root,30);
		bst.inOrder(bst.root);
		
	}
}
