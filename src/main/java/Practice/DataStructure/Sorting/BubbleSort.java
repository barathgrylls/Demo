package Practice.DataStructure.Sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int [] input = {2,4,9,5,6,2,7,8};
		
		int inputlength = input.length;
		
		
		 bubbleSort(input,inputlength);
		
		 printArray(input);
	}

	private static  void bubbleSort(int[] input, int n) {
		
		for(int i=0; i < n-1; i++){  
            for(int j=i+1; j < (n-2); j++){  
				
				if(input[i]>input[j]) {
					swap(i,j,input);
				}
			}
		}

		}

	private static void swap(int i, int j, int[] input) {

//		int temp = input[i];
//		input[i] = input[j];
//		input[j] = temp;
		
		input[i]  = input[i] +input[j];
		input[j]  =input[i] -input[j];
		input[i]  =input[i] -input[j];
		
		
	}
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
