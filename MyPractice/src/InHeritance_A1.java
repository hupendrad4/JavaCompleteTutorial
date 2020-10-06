
 class InHeritance_A1 {
	
	int i=2;
	void TestInheritance_A(){
		
		System.out.println(" This is the method of first class");
	}

	
}

class InHeritance_B1 extends InHeritance_A1
{
	 int j;
	 void TestInHeritance_B() 
	 {
		System.out.println(i++);
	 }
	 
}

class MainClass{
public static void main(String args[]){
		
		InHeritance_B1 Obj1=new InHeritance_B1();
		
		Obj1.TestInheritance_A();
		Obj1.TestInHeritance_B();
		System.out.println(Obj1.i);
	}
}