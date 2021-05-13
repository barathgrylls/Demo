package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeProgram {

	public static void main(String args[]) {
		
		System.out.println("main main");

		
		boolean flag = false;
		int i;
		for ( i =2; i<=10 ;i++) {
		 flag = true;
		
			for(int j = 2 ; j<i ; j++) {
				
				if(i%j == 0) {
				flag = false;
				break;
				}
				
			}
			
			if (flag) {
				System.out.println(i);

			}
		}

		String A ="madam";
		
		 char chr[] = A.toCharArray();
	        StringBuilder sb = new StringBuilder();
	        // System.out.println(chr);
	        // System.out.println(A.length());
	        int length = A.length()-1;
	        
	        for(int k=length ; k>= 0 ; k--){
	            sb.append(String.valueOf(chr[k]));
	        }
	        String B = sb.toString();
	        System.out.println(B);
	        System.out.println(sb);
	        if(A.equals(B))
	            System.out.println("YES");
	        else
	            System.out.println("NO");


//		
	
	
	Stream.of("Barath","Ba").sorted().filter(a->a.startsWith("B")).forEach(System.out::println);
	
	Integer w = new Integer(9);
	System.out.println(w);
	
	Integer []a = {1,2,3};
	String []b = {"Nandini","Kartick"};
	
	for(int k =0 ; k<=a.length-1  ;k++) {
		System.out.println("kkkkkkkkkkkkkk---> "+a[k]);
		
	}
	
	
	
	List<Character> characters = new ArrayList<Character>();
	String s = "Bararath";
	char c[] = s.toCharArray();
	
	for(int ii = 0 ;ii<=c.length-1;ii++ ) {
		if(!characters.contains(c[ii])) {
			characters.add( c[ii]);
		}else {
			System.out.println("duplicate");
		}
	}
	
	//-----///
	
	
	
	
	
	//----///
	
	List< Short> integers = new ArrayList<>();
	for(Short iii =0;iii<10;iii++) {
		integers.add(iii);
		integers.remove(iii);
	}
	
	System.out.println(integers);
	

	List<String> firstList1=new ArrayList<String>(Arrays.asList("M", "W", "J", "K", "T"));  
	List<String> secondList1=new ArrayList<String>(Arrays.asList("M", "W", "E", "K", "T"));  

	 Map<String, Long> test =  firstList1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

	 System.out.println(test);
	}
	
	public static void main(String args) {
		System.out.println("another main");
	    int result = beautifulDays(31, 41, 6);

	}
	
	static {
		System.out.println("inside static block");
		main("Barath");
		String ar[] = {"Test","test2"};
		main(ar);
	}
	
	static {
		System.out.println("inside static block2");
	}

	static int beautifulDays(int i, int j, int k) {
        int count=0;

        for(int x=i;x<=j;x++)
{
    if(Math.abs(x-reverse(x))%k==0)
    count++;
}
return count;

}

static int reverse(int a)
{
int n=0,k=0;
while(a!=0)
{
    k=a%10;
    n=n*10+k;
    a=a/10;
}
return n;
}


}
