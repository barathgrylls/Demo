package Inheritance;

import Practice.AbstractClassObject;

public class ClassB extends AbstractClassObject{
	

	
	static void method1() {
		System.out.println("CLASS B");
	}

 public static void main(String args[]) {
	 
		ClassA test = new ClassC();
		test.method1();;
		
		ClassB b = new ClassB();
		b.method1();
		
		ClassA A = new ClassA();
		
		//A.add();
		
		
		
 }

@Override
public void abstractMethod() {
	// TODO Auto-generated method stub
	
}

}
