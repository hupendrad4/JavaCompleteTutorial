
public class ExceptionHandling {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
     
		String [] s = {"Abc","Def","hij","KLl","125"};
		
		for (i=0; i<s.length;i++) {
			
			try{
			    int intValue =Integer.parseInt(s[i]);//This statement may throw NumberFormatException
				System.out.println(s[i]);
			}
		    catch(NumberFormatException e){
			     System.out.println("The thrown NumberFormatException will be caught here");
	            System.out.println(e);
			}
			
			 finally
	            {
	                System.out.println("This block is always executed");
	            }
		}
		
	}

}
