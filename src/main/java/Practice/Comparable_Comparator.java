package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparable_Comparator implements Comparable<Comparable_Comparator> {
	
	private int comparableComparatorId;
	private String comparableComparatorName;
	
	
	

	public Comparable_Comparator(int i, String string) {
		this.comparableComparatorId=i;
		this.comparableComparatorName = string;
	}

	@Override
	public String toString() {
		return "Comparable_Comparator [comparableComparatorId=" + comparableComparatorId + ", comparableComparatorName="
				+ comparableComparatorName + "]";
	}
	
	public int getComparableComparatorId() {
		return comparableComparatorId;
	}
	public void setComparableComparatorId(int comparableComparatorId) {
		this.comparableComparatorId = comparableComparatorId;
	}
	public String getComparableComparatorName() {
		return comparableComparatorName;
	}
	public void setComparableComparatorName(String comparableComparatorName) {
		this.comparableComparatorName = comparableComparatorName;
	}


	public static void main(String []args) {
		List<Comparable_Comparator> comparableList = new ArrayList<>();
		Comparable_Comparator comparable_Comparator = new Comparable_Comparator(1,"Za");
		Comparable_Comparator comparable_Comparator1 = new Comparable_Comparator(7,"Kumar");
		Comparable_Comparator comparable_Comparator2 = new Comparable_Comparator(3,"Test");
		comparableList.add(comparable_Comparator);
		comparableList.add(comparable_Comparator1);
		comparableList.add(comparable_Comparator2);
		
/*JAVA -7 */
 
		Collections.sort(comparableList);
		System.out.println(comparableList);

		
		Collections.sort(comparableList,new Comparator<Comparable_Comparator>() {

			@Override
			public int compare(Comparable_Comparator o1, Comparable_Comparator o2) {
				// TODO Auto-generated method stub
	            return o1.getComparableComparatorId()-(o2.getComparableComparatorId());
			}

			
		});
	
		System.out.println(comparableList);
	
		/*JAVA -8 - Comparator */
		
		Comparator<Comparable_Comparator> comparator = Comparator.comparing(Comparable_Comparator::getComparableComparatorId);//(a,b) -> a.getComparableComparatorId()- b.getComparableComparatorId();
		Collections.sort(comparableList,comparator);
		System.out.println("Comparator.comparing by ID"+comparableList);
		
		/*JAVA -8 - Stream */
		
		comparableList = comparableList.stream().sorted((a,b)->a.getComparableComparatorName().compareTo(b.getComparableComparatorName())).collect(Collectors.toList());
		System.out.println(" Stream comparator by Name --> " +comparableList);
		
		comparableList = comparableList.stream().sorted((a,b)->a.getComparableComparatorId() - b.getComparableComparatorId()).collect(Collectors.toList());
		System.out.println(" Stream comparator by ID --> "+comparableList);

		
		Integer in = new Integer(1100);
		String stringIn = Integer.toString(in);
		String stringOut = "";
		for(int i = 0 ; i < stringIn.length();  i++)
		{
			if(stringIn.charAt(i) == '0')
				stringOut = stringOut + '1';
			if(stringIn.charAt(i) == '1')
				stringOut = stringOut + '0';
	
		}
		System.out.println("Output : "+stringOut);


	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comparableComparatorName == null) ? 0 : comparableComparatorName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comparable_Comparator other = (Comparable_Comparator) obj;
		if (comparableComparatorName == null) {
			if (other.comparableComparatorName != null)
				return false;
		} else if (!comparableComparatorName.equals(other.comparableComparatorName))
			return false;
		return true;
	}

	@Override
	public int compareTo(Comparable_Comparator o) {
		return this.comparableComparatorName.compareTo(o.comparableComparatorName);
	}





}
