import java.util.PriorityQueue;
import java.util.Comparator;
class Demo implements Comparator<Integer>{
	public int compare (Integer o1 , Integer o2){
		
	
		if(o1>o2){
			return -1;
		}
		else if(o1<o2){
			return 1;
		}
		else
		return 0;
	}
}
class queue{
	public static void main(String[] args){
		PriorityQueue<Integer>xss ttt5555555ttp=new PriorityQueue(new Demo());
		p.add(100);
		p.add(10101);
		p.add(1);
		p.add(2);
		p.add(3);
		System.out.println(p);
		p.remove();
		System.out.println(p);
		p.remove();
		System.out.println(p);
		p.remove();
		System.out.println(p);
		p.remove();
		System.out.println(p);
		p.remove();
		System.out.println(p);

		System.out.println(p);
	}
}
