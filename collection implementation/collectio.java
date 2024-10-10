import java.util.*;
class collectio
{
  public static void main(String[] args)
  {
     ArrayList<String> list=new ArrayList<String>();
     list.add("Ram");
     list.add("JK");
     list.add("SK");
     list.add("Kumar");
     list.add("Anu");
     list.add("Umay");
     list.add("xiu");
     list.add("Pk");
     System.out.println(ensureCapacity(100));
     Iterator lit=list.iterator();
     for(String s:list)
     {
        System.out.println(s);
     }
     //Iterator t=list.iterator();
     //list.removeRange(1,3);
     list.add(2,"Santosh");
     System.out.println("After removing");
    Collections.sort(list);
     
     for(String s:list)
     {
       System.out.println(s);
     }
     System.out.println(list.removeAll(list));
       for(String s:list)
     {
       System.out.println(s);
     }
     System.out.println(list.size());
     ArrayList<String> list1=new ArrayList<String>();
     list1.add("Jack");
     list1.add("JK");
     list1.add("sam");
     System.out.println(list.retainAll(list1));  
  }
}
   
