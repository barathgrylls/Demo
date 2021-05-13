package Practice.DataStructure.Searching;


/*search element only in sorted Array
 * 
 * O(logn) - logramethic time
 */
public class BinarySearch {

	public static void main(String[] args) {

		int [] input = {1,2,3,4,5,6,7,8,9 } ;
		
		int valueToFind = 4;
		
		int position = -1;
		
		int firstIndex = 0;
		
		int lastIndex = input.length-1;
		
		position = binarySearch(input,valueToFind,position,firstIndex,lastIndex);
		
		System.out.println(valueToFind + " is in  " + position + " th  Position");
	}

	
	
	private static int binarySearch(int[] input, int valueToFind, int position, int firstIndex, int lastIndex) {
		
	
		int midIndex = (firstIndex+lastIndex)/2;
		
		if(valueToFind == input[midIndex]) {
			return midIndex;
		}
		else if(valueToFind < input[midIndex]) {
			return binarySearch(input,valueToFind,position,firstIndex,midIndex-1);
		}
		else if(valueToFind >input[midIndex]) {
			return binarySearch(input,valueToFind,position,midIndex,lastIndex);
		}
		
		
		return position;
	}

}
