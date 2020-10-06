
public class ExplicitNarrowingDataType {
	
	
	static short MethodOfExplicitNarrowing(double f) {
		
		
		float i=  (int) f;  //long is explicitly narrowed to int
		return (short) i;  //int is explicitly narrowed to short
    
	}

	public static void main (String args[]) {
		
		double d=10.75;
		float f= (float) d;     //double is explicitly narrowed to float
	
		byte b = (byte) MethodOfExplicitNarrowing((double) f);    //float is explicitly narrowed to long and short to byte
	    System.out.println(b);
		
	}
}
