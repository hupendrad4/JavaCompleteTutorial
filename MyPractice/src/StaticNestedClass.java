
class outerclass{
	

		
		static int i=5;
		
		int j=7;
		
   void methodForNonStatic() {
			
			System.out.println("This is first Outer class method: Non-Static method");
		}
   
   static void methodofStatic() {
	   

		System.out.println("This is first Outer class method: Static method");
   }
		
 static class Innerclass extends outerclass {
	
   void methodForInnerclass() {
				
		System.out.println("This is Second method in outer class:- Static Method");
	//	System.out.println(j);// Non static variable cannot be accessed in static class
		System.out.println(i); // static variable can be accessed in static class
		
		methodForInnerclass();
		methodofStatic();
		//methodForNonStatic(); // Can not access non static method in Static class
			}
}	
	} 

public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass.methodofStatic();

	
	}



}
