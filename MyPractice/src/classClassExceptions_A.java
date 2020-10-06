
public class classClassExceptions_A{

	int i=10;

	void methodforA() {
		
		System.out.println(i);
	}
	
}

class classClassExceptions_B extends classClassExceptions_A{

	int j=20;

	void methodforB() {
		
		System.out.println(j);
	}
	
}

class classClassExceptions_C extends classClassExceptions_B{

	int k=30;
	
	void methodforC() {
		
		System.out.println(k);
	}
}


class TestClassException{
	
	public static void main() {
		
		classClassExceptions_A a=new classClassExceptions_B();
		classClassExceptions_B b= (classClassExceptions_B) classClassExceptions_A();
		
		classClassExceptions_C c= (classClassExceptions_C) classClassExceptions_B();
		System.out.println(c.k); 
		//Every sub class extends its super class. i.e every child class will have some 
		//additional properties along with some inherited properties from its parent class.
		//In the above example, Class A has one property (int i). Class B has two properties, 
		//one is it’s own and another one is inherited. Class C has three properties. 
	//	one is it’s own and two are inherited. In this example, Class C-type reference variable is referring to Class B-type object.
		//Class B-type object will be having only two properties. But, through Class C-type reference variable, you can access Class C’s own property (int k) like in the line 24.
		//But, actually this property does not exist in Class B-type object. This creates the confusion. Class B-type can not be casted to Class C-type.
		//That’s why, you will get class cast exception

	}
}