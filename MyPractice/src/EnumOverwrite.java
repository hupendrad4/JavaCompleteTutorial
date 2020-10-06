
enum Enum1{
	
	 First{
		
		void enumMethod() {
			
			System.out.println("This is First Method");
		}
	},
	
  Second{
		
		void enumMethod() {
			
			System.out.println("This is Second Method");
		}
	},
  
  Third{
		
		void enumMethod() {
			
			System.out.println("This is Third Method");
		}
	};
	

	void enumMethod() {
		
		System.out.println("This is fourth Method");
	}
}


public class EnumOverwrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Enum1.First.enumMethod();
		Enum1.Second.enumMethod();
		Enum1.Third.enumMethod();
		
	}

}
