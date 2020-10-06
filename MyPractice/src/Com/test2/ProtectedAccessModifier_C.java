package Com.test2;
import test.ProtectedAccessModifier_A;
 class ProtectedAccessModifier_D extends ProtectedAccessModifier_A {

	 
	 void methodOfClassD() {
		 
		 System.out.println(++i);
		 	 
		 ProtectedAccessModifier_A a =new ProtectedAccessModifier_A();
		//System.out.println(a.i);     Protected field can not be used outside the package
	    //a.methodOfClassA();          Protected method can not be used outside the package
	 }
	 	
	 
	 public static void main(String arg[]) {
		 ProtectedAccessModifier_D d=new ProtectedAccessModifier_D();
		 d.methodOfClassD();
	 System.out.println(d.i); //Protected field can not be used outside the package
		 
	 } 

}

