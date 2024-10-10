import java.util.*;
class queue
{
  public static void main(String[] args)
  {
     PriorityQueue q=new PriorityQueue(15);
     q.offer("A");
     q.offer("B");
     q.offer("C");
     System.out.println(q);
  }
}
class Mycomparator implements Comparator
{
 public int compare(Object obj1,Object obj2)
 {
  String s1=(String)obj1;
  String s2=obj2.toString();
  return s2.compareTo(s1);
 }
}
