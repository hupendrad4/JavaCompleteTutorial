
public class ThrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			methodForThrow();
			
		}
		
		catch(NullPointerException ex) {
			
			 System.out.println("NullPointerException thrown by methodWithThrows() method will be caught here");
		}
		
	}

	private static void methodForThrow() throws NullPointerException 
	{
		// TODO Auto-generated method stub
		String s=null;
		System.out.println( s.length());	
		
	}

}
