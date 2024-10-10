import java.util.*;
class array
{
  int size;
  int capacity;
  int intialcapacity=4;
  int[] ar;
  array()
  {
    size=0;
    ar=new int[intialcapacity];
    capacity=intialcapacity;
  }
  public void add(int val)
  {
  if(size==capacity)
  {
     expand();
  }
    ar[size++]=val;
  
  }
  private void expand()
  {
    capacity=capacity*2;
   ar= java.util.Arrays.copyOf(ar,capacity);
  }
  public void display()
  {
  System.out.println("Elements in the list");
    for(int i=0;i<size;i++)
    {
       System.out.print(ar[i]+"  ");
    }
    System.out.println();
  }
  public void insert(int val,int pos)
  {
    if(size==capacity)
    {
      expand();
    }
    for(int i=size-1;i>=pos;i--)
    {
      ar[i+1]=ar[i];
    }
    ar[pos]=val;
    size++;
    
  }
  public void get(int index)
  {
     System.out.println("The element is:"+ar[index-1]);
     
  }
  public void deleteatbegining()
  {
    for(int i=1;i<size;i++)
    {
      ar[i-1]=ar[i];
    }
    size--;
  }
  public void remove(int pos)
  {
    for(int i=pos+1;i<size;i++)
    {
      ar[i-1]=ar[i];
    }
    size--;
      
   }
   public void update(int index,int element)
   {
      if(index>=0 && index<size)
      {
       ar[index]=element;
       System.out.println("Element is succesfully updated");
      }
      else
      {
      System.out.println("Index is not present ");
      }
   }
   
      
   public void search(int search)
   {
   int count=0;
   int index=0;
     for(int i=0;i<size;i++)
     {
      if(search==ar[i])
      {
        count++;
        index=i;
        
      }
      
    }
    if(count!=0)
    {
      System.out.println("The element is present in the position:"+(index+1));
    }
    else
    {
      System.out.println("The element is not present in the array");
     }
    
   }
}
class sample
{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    array ls=new array();
    while(true)
    {

      System.out.println("\n====================================");
      System.out.println("1.Insert an element");
      System.out.println("2.Display the element");
      System.out.println("3.Insert the element at any position");
      System.out.println("4.Delete the element:");
      System.out.println("5.Delete at beginning");
      System.out.println("6.Get an element at the specified position");
      System.out.println("7.Search an element");
      System.out.println("8.Update the element at a specified position");
      System.out.println("Exit");
      System.out.println("=======================================");
      System.out.println("Enter the choice:");
      int choice=ob.nextInt();     
      switch(choice)
      {
        case 1:
          System.out.println("Enter the element");
          int val=ob.nextInt();
          ls.add(val);
          break;
         case 2:
             ls.display();
             break;
         case 3:
            System.out.println("Enter the element to be added");
            int value=ob.nextInt();
            System.out.println("Enter the position to be added");
            int pos=ob.nextInt();
            ls.insert(value,pos);
            break;
         case 4:
               System.out.println("Enter the index to be deleted");
               int position=ob.nextInt();
               ls.remove(position);
               break;
          case 5:
             ls.deleteatbegining();
             break;
           case 6:
               System.out.println("Enter the position");
               int index=ob.nextInt();
               ls.get(index);
               break;
           case 7:
             System.out.println("Enter the element to be search");
             int search=ob.nextInt();
             ls.search(search);
           case 8:
              System.out.println("Enter the index to be updated:");
              int ind=ob.nextInt();
              System.out.println("Enter the element to be updated:");
              int element=ob.nextInt();
              ls.update(ind,element);
             break;
           case 9:
              System.exit(0);
              break;
           default:
              System.out.println("Invalid choices");
              break;
       }
    }
  }
}
          
