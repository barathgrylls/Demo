package Practice.DataStructure;

import java.util.Arrays;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {4,5,2,6,7,23,5,235,89,32,4,56,67 };
		int findingNumber = 4;
		int finalPosition = -1;
		//One way
		//finalPosition = oneBinarySerach(array,findingNumber,finalPosition);
		//Second way
		finalPosition = secondBinarySerach(array,findingNumber,finalPosition);

		System.out.println(finalPosition);
	}
	
	

	private static int secondBinarySerach(int[] array, int findingNumber, int finalPosition) {
		
		Arrays.sort(array);
		 int start= 0;
	        int end= array.length - 1;
	        while(start <= end){
	            int mid = (start + end) / 2;
	            if(array[mid] == findingNumber)
	                return mid;
	            else if(array[mid] < findingNumber)
	                start = mid + 1;
	            else
	                end = mid - 1;
	        }
	        return -1;
	}

	
	
	private static int oneBinarySerach(int[] array, int findingNumber,int finalPosition) {

		if(array.length>0) {
			
			
			for(int i=0;i<=array.length-1;i++) {
				
				if(array[i]==findingNumber) {
					
					finalPosition =i;
					break;
				}
			}
		}
		
		return finalPosition;
	}

}
