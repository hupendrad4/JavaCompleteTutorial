
public class ExplicitDownCasting_A {
	
	int i=10;
	
	void methodForA() {
		System.out.println(i);
	}
}

class ExplicitDownCasting_B extends ExplicitDownCasting_A {
	
	int j=20;
	void methodForB() {
		System.out.println(j);
	}
}

class ExplicitDownCasting_C extends ExplicitDownCasting_B {
	
	int k=30;
	
	void methodForC() {
		System.out.println(k);
	}
}


class ExplicitDownCasting_D extends ExplicitDownCasting_C {
	
	int m= 40;
	void methodForD() {
		System.out.println(m);
	}
}



class DownCastingExplicit{
	
	public static void main(String args[]) {
		
		ExplicitDownCasting_A a=new ExplicitDownCasting_A();
		//ExplicitDownCasting_B b= (ExplicitDownCasting_B) a;
	//	ExplicitDownCasting_C c=(ExplicitDownCasting_C) a;
	//	ExplicitDownCasting_D d=(ExplicitDownCasting_D) a;
		a.methodForA();
		
		System.out.println("//*********************************"	);

		ExplicitDownCasting_B b1=new ExplicitDownCasting_B();
		b1.methodForB();
		
		System.out.println("//*********************************"	);		
		ExplicitDownCasting_C c1= new ExplicitDownCasting_C();
		c1.methodForC();
		c1.methodForA();
		c1.methodForB();
		
System.out.println("//*********************************"	);
        ExplicitDownCasting_D d1=(ExplicitDownCasting_D) b1;
		//ExplicitDownCasting_D d1=new ExplicitDownCasting_D();
        
        d1 =(ExplicitDownCasting_D) new ExplicitDownCasting_C();
		d1.methodForA();
		d1.methodForB();
		d1.methodForC();
		d1.methodForD();
		
		
		
	
		
	}
}