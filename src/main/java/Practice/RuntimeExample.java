package Practice;

import java.io.IOException;

public class RuntimeExample {

	public static void main(String []args) throws IOException {
		//Runtime.getRuntime().exec("calc");
		  System.out.println(Runtime.getRuntime().availableProcessors());
		  Runtime r=Runtime.getRuntime();  
		  System.out.println("Total Memory: "+r.totalMemory());  
		  System.out.println("Free Memory: "+r.freeMemory());  
		    
	}
}
