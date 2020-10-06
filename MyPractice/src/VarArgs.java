public class VarArgs {
	
	
	static  double avarage(int...a) {
		
		int n=a.length;
		float SumOfNumbers=0;
		
		for (float i: a ) 
		{
			
			SumOfNumbers=SumOfNumbers + i;	
		}
		return (SumOfNumbers/n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(avarage(20,30));
		System.out.println(avarage(1,2,3,4,5,6));
		System.out.println(avarage(5,6,6,8,9));
		System.out.println(avarage(2,3));
	}


}
