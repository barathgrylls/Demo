package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

import antlr.collections.List;

public class CallByValueAndRefernce {

	public static void main(String[] args) {


		//call by value -- int,char,boolean.string.float ---primitive type
		
		int i =10;
		System.out.println(" inital i value " +i);
		
		i= changeIValue(i);
		
		System.out.println(" final value of i " +i);

		//call by refernce --- arrys,linkedlist,arryalist - non prinitive type
		
		int []j = {10,20};
		System.out.println(" inital j value " +j[0]);
		
		changeJValue(j);//refernece
		
		System.out.println(" final value of j " +j[0]);
		
		
		
		//interview question
		int x=-4;
		
		System.out.println(x>>2);
		
		int y=4;
		
		System.out.println(y>>2);
		
		
		///
		Vector<String> vector = new Vector<>();
		if(!vector.isEmpty())
			System.out.println(vector.isEmpty()); 
		
		if(null!=vector)
			System.out.println(vector.isEmpty()); 
		
		//
		
		ArrayList< Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,4));
		System.out.println(arrayList.size());
		Collections.swap(arrayList, 0, 2);
		System.out.println(arrayList);
		
		//
		Long l = new Long(256);
		System.out.println(l.hashCode());
		
		Integer integer = new Integer(32768);
		System.out.println(integer.hashCode());
		
		StringBuffer buffer = new StringBuffer();
		System.out.println(buffer.hashCode());

		
		// two list compare
		
		java.util.List<String> list1 = new ArrayList<>(Arrays.asList("AAA","BBB","CCC"));
		java.util.List<String> copylist = new ArrayList<>(list1);

		java.util.List<String> list2 = new ArrayList<>(Arrays.asList("BBB","CCC","DDD"));
		
		list1.removeAll(list2);
		System.out.println(list1); //will have not contains value
		
		
		copylist.removeAll(list1);
		System.out.println(copylist); //will have the contains value

		
		
		
		
		
		

	}

	private static void changeJValue(int[] j) {
		j[0]=30;
		System.out.println(" Midified value of j " +j[0]);
		
	}

	private static int changeIValue(int i) {

		i=30; //new memory address
		System.out.println(" Midified value of i " +i);
		return i;
	}

}
