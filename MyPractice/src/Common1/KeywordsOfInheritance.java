package Common1;

public class KeywordsOfInheritance {
	
	    private int i=1;
	    int j=2;
	    protected int k=3;
	    public int m=5;
	
}


class Inheritance_B extends KeywordsOfInheritance{

	void methodOfClassB()
    {
        //System.out.println(i);        Private member can not be inherited
        System.out.println(j);           //Default member can be inherited within package
        System.out.println(k);         //protected member can be inherited to any subclass
        System.out.println(m);       //public member can be inherited to all sub classes
    }
	
}

class Inheritance_C extends Inheritance_B{

	void methodOfClassC()
    {
		System.out.println(j);     //Default member can be inherited within package
        System.out.println(k);    //protected member can be inherited to any subclass
        System.out.println(m);    //public member can be inherited to any subclass
 
        Inheritance_B b = new Inheritance_B();
        System.out.println(b.j);   //Default member can be used within package
        System.out.println(b.k);   //Protected member can be used anywhere in the package
        System.out.println(b.m);  //Public member can be used anywhere
    }
	
	
	
}