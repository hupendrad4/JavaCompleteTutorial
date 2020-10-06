
 class StaticBlock{
	
	static int staticVariable;
	static
	{
		System.out.println("StaticComponents SIB");
		staticVariable = 10;
	}
	
    static void staticMethod()
    {
    	System.out.println("From StaticMethod");
        System.out.println(staticVariable);
    }
    
    
    static
    {
        System.out.println("Class A SIB");
    }
    static
    {
        System.out.println("Class A IIB");
    }
 }

  class Mainrun{
	
	  static
	     {
	          System.out.println("MainClass SIB");
	     }
	  
	  public static void main(String args[])
	  	 {
	  		//Static Members directly accessed with Class Name
	           StaticBlock.staticVariable=20;
	           StaticBlock.staticMethod();
	           
	  	 }
	
}

