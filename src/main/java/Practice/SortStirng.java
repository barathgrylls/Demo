package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch.qos.logback.core.boolex.Matcher;

public class SortStirng {

	public static void main(String args[]) {
		
		//sampleList = ["#chennai", "andhara", "@#$&mumbai"]
				
				List<String> list = new ArrayList<>();
				list.add("#chennai ");
				list.add("andhar a");
				list.add("@#$&mu mbai");
				
				
				Map<String,String> treeMap =new TreeMap<>(); 
								
				for (String s : list) {
					treeMap.put(s.replaceAll("[^a-zA-Z0-9]", ""), s);
				}
		
				System.out.println(treeMap);
				
				for(Map.Entry<String, String> entry :treeMap.entrySet()) {
					System.out.println(entry.getValue().trim());
				}

				//System.out.println(list2);
				//System.out.println(list);


	}
}
