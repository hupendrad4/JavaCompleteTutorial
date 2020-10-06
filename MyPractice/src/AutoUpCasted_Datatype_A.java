
public class AutoUpCasted_Datatype_A {
	
	int i=10;
	void MethodA() {
    System.out.println(i);
	}
}

class AutoUpCasted_Datatype_B extends AutoUpCasted_Datatype_A{
	
	int j=20;
	void MethodB() {
	    System.out.println(j);
		}
}

class AutoUpCasted_Datatype_C extends AutoUpCasted_Datatype_B{
	
	double k=30.2;
	void MethodC() {
	    System.out.println(++k);
		}
}
class AutoUpCasted_Datatype_D extends AutoUpCasted_Datatype_C{
	
	int m=40;
	void MethodD() {
	    System.out.println(m);
		}
}


class upCastingAuto{
	
	public static void main(String args[]) {
		
		AutoUpCasted_Datatype_D d=new AutoUpCasted_Datatype_D();
		AutoUpCasted_Datatype_C c= d;
		AutoUpCasted_Datatype_B b= d;
		AutoUpCasted_Datatype_A a=d;
		d.MethodA();
		d.MethodB();
		d.MethodC();
		d.MethodD();
		
	}
}