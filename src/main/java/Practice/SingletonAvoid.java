package Practice;

import java.lang.reflect.Constructor; 

public class SingletonAvoid 
{ 

	// public instance initialized when loading the class 
		public static SingletonAvoid instance = new SingletonAvoid(); 
		
//		private SingletonAvoid() 
//		{ 
//			// private constructor 
//		} 
		public enum Singleton  
		{ 
		  INSTANCE; 
		} 
	public static void main(String[] args) 
	{ 
		SingletonAvoid instance1 = SingletonAvoid.instance; 
		SingletonAvoid instance2 = null; 
		try
		{ 
			Constructor[] constructors = 
					SingletonAvoid.class.getDeclaredConstructors(); 
			for (Constructor constructor : constructors) 
			{ 
				// Below code will destroy the SingletonAvoid pattern 
				constructor.setAccessible(true); 
				instance2 = (SingletonAvoid) constructor.newInstance(); 
				break; 
			} 
		} 
	
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		} 
		
	System.out.println("instance1.hashCode():- "
									+ instance1.hashCode()); 
	System.out.println("instance2.hashCode():- "
									+ instance2.hashCode()); 
	} 
} 

