package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class ListPrograms{

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add(" ");  
		list.add("Ajay");  
		list.remove("Ajay");
		Iterator iterator= list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());
		System.out.println(" ");  

		System.out.println("iterating the queue elements:");  

		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println(" ");  

		System.out.println("after removing two elements:");  

		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  

		Map<Integer, String> map=new HashMap<Integer, String>();  
	    //Adding elements to map  
	    map.put(1,"map Amit");  
	    map.put(5," map Rahul");  
	    map.put(2,"map Jai");  
	    map.put(6,"map Amit");  
	    map.put(6,"testt");  
	    
	    Set set = map.entrySet();
	    List<String> list3 = new ArrayList<String>();
	    list3.addAll(set);
	    System.out.println(" converted list "+list3);
	    System.out.println(" converted set "+set);

	    

	    for(Map.Entry<Integer, String> mapEntry : map.entrySet()) {
	    	System.out.println(mapEntry.getKey());
	    	System.out.println(mapEntry.getValue());
	    }
	}

}
