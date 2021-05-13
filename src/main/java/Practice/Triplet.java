package Practice;

public class Triplet {

	//need to do
	public static void main(String[] args) {

		int arr[] = {12, 11, 10, 5, 6, 2, 30};
		
		int outputTriplet[] = new int[3];
		int counter =-1;
		
		for(int i =0; i<arr.length-1;i++) {
			
			if(arr[i] < arr[i+1]) {
				counter ++;
				if(outputTriplet.length<=3) {
					outputTriplet[counter] = arr[i];
					outputTriplet[counter+1] = arr[i+1];
					counter = counter+1;
				}
			}
		}
		System.out.println(outputTriplet);
	}

}
