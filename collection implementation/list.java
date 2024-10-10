import java.util.*;
class list
{
  public static void main(String[] args)
  {
    LinkedList l=new LinkedList();
    l.add("a");
    l.add("b");
    l.add("c");
    Iterator it=l.iterator();
    while(it.hasNext())
    {
      System.out.println(it.next()); 
   }
   System.out.println("Adding the element:\n=====================");
   l.addFirst("b");
   l.addLast("d");
    Iterator it1=l.iterator();
    while(it1.hasNext())
    {
      System.out.println(it1.next()); 
   }
   System.out.println("After the operation");
   System.out.println( l.getFirst());
   System.out.println(l.getLast());
   l.remove("b");
   Iterator it2=l.iterator();
    while(it2.hasNext())
    {
      System.out.println(it2.next()); 
   }
   
   
}
}
