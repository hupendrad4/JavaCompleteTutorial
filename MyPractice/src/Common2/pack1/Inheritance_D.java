package Common2.pack1;
import Common1.KeywordsOfInheritance;


public class Inheritance_D  extends KeywordsOfInheritance{
	    void methodOfClassD()
	    {
	        //System.out.println(j);   Default members can not be inherited outside package
	        System.out.println(k);  //Protected member can be inherited to any subclass
	        System.out.println(m);  //public member is always inherited to any subclass
	 
	        KeywordsOfInheritance a = new KeywordsOfInheritance();
	        //System.out.println(a.i);   private member not visible outside the class
	        //System.out.println(a.j);   Default members are not visible outside package
	        //System.out.println(a.k);   Protected member can not be used outside the package.
	        System.out.println(a.m);     //public member can be used anywhere
	    }
	}
	 
	class Inheritance_E extends Inheritance_D
	{
	    void methodOfClassE()
	    {
	        System.out.println(k);     //Protected member can be inherited to any subclass
	        System.out.println(m);     //public member is always inherited
	 
	        Inheritance_D d = new Inheritance_D();
	        //System.out.println(d.k);     Protected member can not be used outside the package.
	        System.out.println(d.m);    //public member can be used anywhere
	    }
	}
	
class MainTestRun{
	
	public static void main(String args[])
	{
		Inheritance_E e=new Inheritance_E();
		e.methodOfClassD();
		e.methodOfClassE();
		
	}
}
