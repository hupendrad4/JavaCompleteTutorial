
public class AutoWideningDataType {
	

	static double  MethodForAutoWidening(int i) {
		
		
		float j=i;
		return j;
	
		
	}
	
	
	public static void main(String args[])
	{
		

         byte b = (byte) 10.2;
         short s = b;      //byte is auto widened to short
         double d = MethodForAutoWidening(s);    //short is auto widened to int and float to double
         System.out.println(d);
    
	}

}
