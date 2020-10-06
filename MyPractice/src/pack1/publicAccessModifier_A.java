package pack1;
public class publicAccessModifier_A {
	
	public int i=3;
	
	public void methodOfclassA() {
		
		System.out.println(++i);
		publicAccessModifier_B b=new publicAccessModifier_B();
		
	}

    public class publicAccessModifier_B
    {
      //public Inner Class
    }

}

class publicAccessModifier_C extends publicAccessModifier_A{
	
	void methodOfClassC() {
		
		  System.out.println(i);        //public field can be inherited to any sub class 
		  
		  publicAccessModifier_A a = new publicAccessModifier_A();
	        System.out.println(a.i);     //public field can be used anywhere
	        a.methodOfclassA();       //public method can be used anywhere
	   
	}
	
}