package Practice.DataStructure.Sorting;


/*O(logn)
 * Divide and conquer
 * Break into small pieces and merge
 */
public class MergeSort {

	public static void main(String[] args) {

		int [] input = { 2,4,5,6,2,7,4,8};
				
		int inputlength = input.length;
		
		int[] output = new int[inputlength];

		
		output = mergerSort(input,output,0,inputlength);
		
		System.out.println(output);
	}

	private static int[] mergerSort(int[] input, int[] output, int startIndex, int lastIndex) {

		if (startIndex<lastIndex)  
		{  
		int mid = (startIndex+lastIndex)/2;
		
		mergerSort(input, output, startIndex, mid);	
		mergerSort(input, output, mid+1, lastIndex);
		
		output = merger(input, output, startIndex,mid, lastIndex);
		}
		return output;
	}

	private static int[] merger(int[] input, int[] output, int startIndex, int mid, int lastIndex) {

		int l = mid - startIndex + 1;  
		int r = lastIndex - mid;  
		  
        int i,j;  

        
		int LeftArray[] = new int [l];  
		int RightArray[] = new int [r];  
		  
		for ( i=0; i<l; ++i)  
			LeftArray[i] = input[startIndex + i];  
		  
		for (j=0; j<r; ++j)  
			RightArray[j] = input[mid + 1+ j];  
		
		i = 0; j = 0;  
		int k = startIndex;  
		while (i < l && j < r)  
		{  
		if (LeftArray[i] <= RightArray[j])  
		{  
			input[k] = LeftArray[i];  
		i++;  
		}  
		else  
		{  
			input[k] = RightArray[j];  
		j++;  
		}  
		k++;  
		}  
		while (i < l)  
		{  
			input[k] = LeftArray[i];  
		i++;  
		k++;  
		}  
		  
		while (j < r)  
		{  
			input[k] = RightArray[j];  
		j++;  
		k++;  
		}  
		  
		
		return input;
	}

}
