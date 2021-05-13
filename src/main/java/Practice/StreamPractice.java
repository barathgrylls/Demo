package Practice;

import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) throws IOException {

		System.out.println("--------------Stream Practice Start--------------------");
		
		Map<String, Long> charCount = word.codePoints().mapToObj(Character::toString)
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCount);
		
		List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);

		
		//1.Integer Stream
		long count = IntStream.range(1, 10).count();
		int sum = IntStream.range(1, 10).sum();
		IntStream.range(1, 10).forEach(System.out::print);
		System.out.println();
		IntStream.range(1, 10).skip(5).forEach(System.out::print);
		System.out.println();
		System.out.println("count---->" + count);
		System.out.println("sum---->" + sum);
		
		//2.String to sorted and find
		Stream.of("Barath","Eminem","Grylls").sorted().forEach(System.out::println);
		Stream.of("Barath","Eminem","Grylls").sorted().findFirst().ifPresent(System.out::println);
		Stream.of("Barath","Eminem","Grylls").filter(x->x.startsWith("Em")).forEach(System.out::println);
		//Stream.of("Barath","Eminem","Grylls").collect(collector)(supplier, accumulator, combiner)
		
		//3.using map
		Stream.of(1,2,3,1,5,1,2,3).map(x->x*x).distinct().forEach(System.out::println);
		
		//reading from file 
		//File file = new File("C:\\Users\\bsubra11\\Desktop\\BARATH\\Rappers.txt");
		//file.createNewFile();
	    //System.out.println(file);
		
		  Path pathToFile = Paths.get("C:\\Users\\bsubra11\\Desktop\\BARATH\\Rappers.txt");
		 // System.out.println(pathToFile.toAbsolutePath());
		  URI uri = pathToFile.toUri();
		 // System.out.println(uri);


		Stream<String> rappers = Files.lines(Paths.get(uri));
		rappers.sorted().filter(x->x.length()>20).forEach(System.out::println);
		rappers.close();
		System.out.println( );
		Stream<String> rappers1 = Files.lines(Paths.get(uri));
		rappers1.sorted().filter(x->x.contains("rapper, ")).collect(Collectors.toList()).forEach(System.out::println);
		rappers1.close();

	   // System.out.println(rappers);
		
		List<Integer> a = Stream.of("1","2").map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(a);
		
		List evens = Arrays.asList(2, 4, 6); 
		List odds = Arrays.asList(3, 5, 7); 
		List primes = Arrays.asList(2, 3, 5, 7, 11);
		
		List<Integer> integers = (List<Integer>) Stream.of(evens,odds,primes).flatMap(map->map.stream()).distinct().collect(Collectors.toList());

		System.out.println(integers);
		
		List<Integer> numbers = Arrays.asList(2, 4, 6); 
		List<String> strings = Arrays.asList("Barath","Tst"); 
		Map<String, Integer> map = new HashMap<>();
		Iterator<Integer> iteratorNumber = numbers.iterator();
		Iterator<String> iteratorString = strings.iterator();
		
		Map<String, Integer> map1 = IntStream.range(0, strings.size())
                .collect(
                     HashMap::new, 
                     (m, i) -> m.put(strings.get(i), numbers.get(i)), 
                     Map::putAll
                );
		System.out.println(map1);


		while (iteratorNumber.hasNext() || iteratorString.hasNext()) 
			map.put(iteratorString.next(), iteratorNumber.next());

		System.out.println(map);
		

		System.out.println("---------------Stream Practice end-----------------------");

	}

}
