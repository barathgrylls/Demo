package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CargoShipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = {3,34,35,36,2,41,42,5,1,2,3,4,5};
		int a[] = {4,33,36,27,15,5,43,35,36,42,49};

		List<Integer> list = new ArrayList<>();
		Map<Integer, List<Integer>> map = new LinkedHashMap();

		int targer = 0;
		for(Integer i : a) {
			
			if (targer == 0) {
				
				targer =i;
			}else {
				list.add(i);
				if(list.size() == targer) {
					List<Integer> temp = new ArrayList<Integer>();
					temp.addAll(list);
					map.put(targer, temp)		;			

					targer=0;
					list.clear();
				}
			}			
		
		}

		System.out.println( " final map " +map);
		List <List<Integer>> list2 = new ArrayList<List<Integer>>();
		//list2 = (List<List<Integer>>) map.values();
		list2 = map.values().stream().collect(Collectors.toList());
		System.out.println( " list2 " +list2);
		int outmul = 0;
		int outAdd = 0;
		for(List list3: list2) {

			Collections.sort(list3);
			int min =(int) list3.get(0);
			int leng = list3.size();
			outmul = min*leng;
			outAdd = outAdd+outmul;
			System.out.println( " outmul " +outmul);

			
		}


		System.out.println( " outAdd " +outAdd);

		

	}

}
