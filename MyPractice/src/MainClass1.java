
class NonStaticVariable1 {
	
	int NonStaticVariable;
	static int StaticVariable=10;
	
	static void staticMethod() 
	{
		//System.out.println(NonStaticVariable);
		System.out.println(StaticVariable);
	}
	
	public void nonStaticMethod()
	{
		System.out.println(NonStaticVariable);
		System.out.println(StaticVariable);
	}

}


public class MainClass1
{
	public static void main(String args[]) 
	{
		NonStaticVariable1.StaticVariable=10;
		NonStaticVariable1.staticMethod();
		
		
		NonStaticVariable1 obj1=new NonStaticVariable1();
		NonStaticVariable1 obj2=new NonStaticVariable1();
		
		
		System.out.println(obj1.NonStaticVariable);
		System.out.println(obj1.StaticVariable);
		
		obj1.staticMethod();
		obj1.nonStaticMethod();
		
		System.out.println(obj2.NonStaticVariable);
		System.out.println(obj2.StaticVariable);
		obj2.StaticVariable=20;
		System.out.println(obj2.StaticVariable);
		
		obj2.nonStaticMethod();
		obj2.staticMethod();
	}
	
}