
public class StackAndHeapMemory {

	
	static void methodone()
	{
		System.out.println("This is method One");
		methodtwo();
	}
		static void methodtwo()
	{
		System.out.println("This is method two");
	}
		public static void main(String args[])
	{
	  System.out.println("Main Method started ");
		methodone();
      System.out.println("Main Method ended ");
	}
}


