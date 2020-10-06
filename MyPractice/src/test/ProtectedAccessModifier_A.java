package test;

public class ProtectedAccessModifier_A {

	protected int i=23;
	
	void methodOfClassA() {
		
		System.out.println(" The Method is protected ");
		System.out.println(i);
		
		ProtectedAccessModifier_B b =new ProtectedAccessModifier_B();
	}
	
	protected class ProtectedAccessModifier_B {
		
		  //Protected Inner Class
	}
}


class ProtectedAccessModifier_C extends ProtectedAccessModifier_A{
	
	
	void methodClassC() {
		
		System.out.println(i);
		
		ProtectedAccessModifier_A a =new ProtectedAccessModifier_A();
		a.methodOfClassA();
		System.out.println(a.i);
	}
}
