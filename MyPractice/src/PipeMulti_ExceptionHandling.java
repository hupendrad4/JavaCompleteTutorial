
public class PipeMulti_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[] = {"abc","tes",null,"nk2"};
		
		for (int i=0;i<6;i++) {
			
			try
            {
                int a = s[i].length() + Integer.parseInt(s[i]);    
 
                //This statement may throw NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException
            }

			
			 catch( NumberFormatException | NullPointerException | ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Now, this block handles  NumberFormatException, NullPointerException and ArrayIndexOutOfBoundsException");
            }
			
			finally {
				System.out.println("The Every time this block will execute ");
			}
	}

}
}