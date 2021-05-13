package Practice.DataStructure.Searching;


/*Scans one item at a time
 * 
 * O(n) - constant time
 * 
 */
public class LinearSearch {
	
	public static void main(String [] args) {
	
	int[] input = {0,3,5,2,7,4,8,9,2};
	
	int valueToFind = 9;
	
	int position = -1;
	
	 position = linearSerach(input,valueToFind,position);
	 
	 if(position==-1)
		 System.out.println("Value is not there in the list...");
	 
	 else
		 System.out.println(valueToFind + " is in " + position + " position...");
			
	}

	private static int linearSerach(int[] input, int valueToFind, int position) {
		for(int i : input) {
			position++;
			if(i == valueToFind) {
				break;
			}
		}
	return position;
	}

}
