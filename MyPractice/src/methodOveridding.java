class SupperClass{
	
	  int methodOveridding() {
		
		System.out.println("This is Supperclass method ");
		return 0;
	}
}

class SubClass extends SupperClass{
	
	 int  methodOveridding() {
		
		System.out.println("This is Subclass method");
		return 0;
	}
}



public class methodOveridding {

	
	public static void main(String args[]) {
		
	    SupperClass supperclass=new SupperClass();
	    supperclass.methodOveridding();   //Output : From Supper Class
		
		SubClass subclass=new SubClass();
		subclass.methodOveridding();  //Output : From Subclass Class
		
	}
}
