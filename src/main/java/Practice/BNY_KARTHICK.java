package Practice;

public class BNY_KARTHICK {
	
	
	public static void main (String []args) {
		
		/* Custom sorted Array*/
		
		int arr[]= {8,5,11,4,6};
		
		int counter = 0;
        /* Initialize left and right indexes */
        int left = 0, right = arr.length - 1;
        while (left < right) {
            /* Increment left index while we see 0 at left */
            while (arr[left] % 2 == 0 && left < right)
                left++;
            /* Decrement right index while we see 1 at right */
            while (arr[right] % 2 == 1 && left < right)
                right--;
            if (left < right) {
                /* Swap arr[left] and arr[right]*/
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
                counter++;
            }
        }
        System.out.println(counter);
        
        /* sam and kelly  
       Kelly = 3;
       Sam =5;
       Differnce = 5;
        */
       int out =  minNum(3,5,5);
       System.out.println(out);

       
      
    }
	static int minNum(int A, int K, int P) {
        // No catching up because Asha is ahead (positive P) and Kelly cannot catch up.
        if (K <= A) {
            return -1;
        }
        return P/(K - A) + 1;
    }
	}


