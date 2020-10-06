

class AnyClass1{
	int i=15;
	
	AnyClass1(){
		System.out.println("This is Basic Constructor");
	}

	AnyClass1(int j){
		this();
		System.out.println("This is Spacial Case of Constructor ");	
	}
	
	void methodOneClass() {
		
		 System.out.println("From method one");
	}
	
	void methodTwoClass() {
		this.methodOneClass();
		System.out.println(this.i);
	}
}




public class ThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnyClass1 obj=new AnyClass1();
		//obj.methodTwoClass();
		obj.methodOneClass();
	}

}
