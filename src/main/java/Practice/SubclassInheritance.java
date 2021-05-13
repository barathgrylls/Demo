package Practice;


public class SubclassInheritance extends SuperClassInheritance  {
	

		public void childClass() {
			System.out.println("child class");
		}
		public void childClass1() {
			System.out.println("child class 1");
		}
		
		
		public static void main(String []args) {
			
			SuperClassInheritance classInheritance= new SubclassInheritance();
			SubclassInheritance subclassInheritance = new SubclassInheritance();
			
			classInheritance.someMethod();
			classInheritance.superClass();
			//classInheritance.childclass1
			subclassInheritance.childClass();
			subclassInheritance.childClass1();
			
		}
	}

