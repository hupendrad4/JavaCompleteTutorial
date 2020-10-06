
interface InterfaceClassOne{
	
	void methodOne();
}

interface InterfaceClasstwo{
	
	void methodtwo();
}


class InterfaceClassThree implements InterfaceClassOne ,InterfaceClasstwo {

	
	public void methodtwo() {
		// TODO Auto-generated method stub
		
		System.out.println("This is Method two implementation");
	}

	
	public void methodOne() {
		// TODO Auto-generated method stub
		System.out.println("This is Method one implementation");
	}
	
	
}


public  class MultipleInheritance {

	public static void main(String args[]) {
		InterfaceClassThree obj=new InterfaceClassThree();
		obj.methodOne();
		obj.methodtwo();
		
	}	
}
