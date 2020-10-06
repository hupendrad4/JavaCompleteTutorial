
class Superclass{
	
	int i;
	
	Superclass(int j)
	    {
	        System.out.println("Super Class Constructor");
	    }
	
	
	void superClassMethod() {
		
		System.out.println(10);
		System.out.println("From thhe SuperClassMethod");
		System.out.println("Test");
	}
}

class SubClass12 extends Superclass {
	
	
	
	SubClass12(int j) {
		super(j);  //Super class constructor is called by super() calling statement
		// TODO Auto-generated constructor stub
	}

	void subClassMethod() {
		super.superClassMethod(); //calling super class content in subclass method
		System.out.println(15);
		System.out.println("This is SubClass Method ");
		//super.superClassMethod();
		
	}
	
}


public class SuperKeyword {

	public static void main(String args[]) {
		SubClass12 obj =new SubClass12(5);
		obj.subClassMethod();

		
	}
	
}
