package Practice;

import java.util.Arrays;
import java.util.List;

//immutable class
public final class Agilsys {
	
	final String name = "" ;
	final String anotherName = "";
	final List<String> list = Arrays.asList("Barath","Grylls");
	
	//Calling one Constructor to Another Constructor
	
	private  Agilsys(){
		this("barath");
		System.out.println("inside Default Constructor");

	}
	
   private Agilsys(String name){
	this("barath","grylls");
		System.out.println("inside one parameterized Constructor");

	}
	
   private Agilsys(String name,String anotherName){
		System.out.println("inside two parameterized Constructor");

	}
	
	
	//IntArray to int without String

	@Override
public String toString() {
	return "Agilsys [name=" + name + ", anotherName=" + anotherName + ", list=" + list + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5,6,7,8,9};
		int output = 0;
		for(int num : a) {
			output = output*10;
			output = output+num;
		}
		System.out.println(output);
		Agilsys agilsys = new Agilsys();
		System.out.println(agilsys.toString());
	}
	
	

}

