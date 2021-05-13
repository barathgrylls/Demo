package Practice;

public class PowerOfN {

	public static void main(String[] args) {

		int output = power(1,1);
		System.out.println(output);
	}

	private static int power(int value, int powerValue) {

		int i=0;
		while(i<powerValue-1) {
			i++;
			value= value*value;
		}
		
		return value;
	}

}
