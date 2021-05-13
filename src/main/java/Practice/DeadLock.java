package Practice;

import java.util.Arrays;

public class DeadLock {

	public static void main(String[] args) {
		final String resource1 = "ratan jaiswal";
		final String resource2 = "vimal jaiswal";
		// t1 tries to lock resource1 then resource2
		Thread t1 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		// t2 tries to lock resource2 then resource1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (resource1) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (resource2) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();

		Marks(null);

		int a = 10;
		int b = 20;
		System.out.println("Before Swap: a=" + a + ", b= " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swap:  a=" + a + ", b=" + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("After Swap:  a=" + a + ", b=" + b);

		int[] array = { 4, 5, 3, 7, 2, 1, 1, 0, 3, 4 };

		Arrays.sort(array);

		int out = 0;

		for (int f = 0; f <= array.length - 1; f++) {

			for (int g = 0; g <= array.length - 1; g++) {
				if (out == 0 && f != g) {

					if (array[f] == array[g]) {
						out = array[f];
						break;
					}
				}
			}
		}
		System.out.println("least duplicate " + out);

	}

	private static void Marks(String S) {
		System.out.println("inside Stirng");
	}

	private static void Marks(Object object) {
		System.out.println("inside Object");

	}

}
