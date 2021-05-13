package Practice.DataStructure.Sorting;

public class SelectionSort {

	public static void main(String[] args) {

int [] input = {2,9,4,5,6,2,7,8};
		
		int inputlength = input.length;
		
		
		 selectionSort(input,inputlength);
		
		// printArray(input);
	}

	private static void selectionSort(int[] input, int inputlength) {


		for(int i =0; i<inputlength-1;i++) {
			
			for(int j= i+1 ; j<inputlength ;j++) {
				
				if(input[j] < input[i])
					i = j;

			}
			System.out.println(input[i]);

		}
	}

//		
//		 // One by one move boundary of unsorted subarray
//        for (int i = 0; i < n-1; i++)
//        {
//            // Find the minimum element in unsorted array
//            int min_idx = i;
//            for (int j = i+1; j < n; j++)
//                if (arr[j] < arr[min_idx])
//                    min_idx = j;
//  
//            // Swap the found minimum element with the first
//            // element
//            int temp = arr[min_idx];
//            arr[min_idx] = arr[i];
//            arr[i] = temp;
//        }
//	}

	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
