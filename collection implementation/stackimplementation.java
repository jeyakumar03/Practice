import java.util.Scanner;
class stack
{
   int top;
   stack()
   {
     top=-1;
   }
   int max_size=30;
   int[] ar=new int[max_size];
   public void push(int val)
   {
      if(top==max_size-1)
      {
        System.out.println("Stack overflow");
      }
      ar[++top]=val;
   }
  public int pop(){
    if(top==-1) {
     System.out.println("Stack underflow");
    }
    return ar[top--];
  }
  public int peek()
  {
     if(top==-1)
    {
     System.out.println("Stack underflow");
    }
    return ar[top];
  }
  public void display()
  {
    for(int i=0;i<=top;i++)
    {
       System.out.print(ar[i]+" ");
    }
    System.out.println();
  }
   
}
class imp
{
  public static void main(String[] args)
  {
     Scanner ob=new Scanner(System.in);
     stack s=new stack();
     while(true)
     {
     System.out.println("1.Insert to the stack:");
     System.out.println("2.Pop and remove the element");
     System.out.println("3.Peek and display the element");
     System.out.println("4.Display ");
     System.out.println("5.exit");
     System.out.println("Enter the choice");
     int choice=ob.nextInt();
     switch(choice)
     {
        case 1:
           System.out.println("Enter the element:");
           int val=ob.nextInt();
           s.push(val);
           break;
         case 2:
              s.pop();
              break;
         case 3:
              s.peek();
              break;
          case 4:
             s.display();
             break;
          case 5:
              System.exit(0);
              break;
          default:
              System.out.println("Invalid choice");
              break;
        }              
             
     }
  }
}

      
