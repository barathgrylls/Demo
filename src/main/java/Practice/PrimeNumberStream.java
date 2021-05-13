package Practice;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream;


public class PrimeNumberStream {

	public static void main(String []args) {
//------------------------------prime number normal java code-----------------------------------//
		int i=0,j=0;
		boolean flag = true;
		for(i=2;i<1000;i++) {
			flag = true;
			for(j=2;j<i;j++) {
				if(i%j ==0) {
					flag = false;
					break;
				}
			}
			if(flag) 
				System.out.println(i);

		}
//------------------------------prime number java8 stream code-----------------------------------//

		for(int number=2;number<10;number++) {
			boolean flagStream = isPrime(number);
			if(flag) {
				System.out.println(+number);
			}
		}
		
		long startTime = System.currentTimeMillis();
		Stream.iterate(0, n->n+1).limit(10000).filter(PrimeNumberStream::isPrime).forEach(x->System.out.println(x));
		long endTime = System.currentTimeMillis();
		System.out.println("Noraml Stream timing for 10000 records--> "+String.valueOf(endTime-startTime));
		
		
		long startParallelTime = System.currentTimeMillis();
		Stream.iterate(0, n->n+1).limit(10000).parallel().filter(PrimeNumberStream::isPrime).forEach(x->System.out.println(x));
		long endParallelTime = System.currentTimeMillis();
		System.out.println("Parallel Stream timing for 10000 records-->  "+String.valueOf(endParallelTime-startParallelTime));


	}
	
	

	private static boolean isPrime(int a) {
		if(a<=1)
			return false;
		else
			return !IntStream.rangeClosed(2, a/2).anyMatch(i -> a % i == 0);
	}

}

 