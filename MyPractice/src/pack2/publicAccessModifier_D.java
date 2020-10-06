package pack2;
import pack1.publicAccessModifier_A;

public class publicAccessModifier_D extends publicAccessModifier_A{
	
	void methodOfClassD() {
		
		        System.out.println(--i);        //public field can be inherited to any sub class 
		 
		        publicAccessModifier_A a = new publicAccessModifier_A();
		        System.out.println(a.i);     //Public field can be used anywhere
		        a.methodOfclassA();
		    }
		
	
   public static void main(String args[]) {
	   

	   publicAccessModifier_D d=new publicAccessModifier_D();
	   System.out.println(d.i);   
	   d.methodOfclassA();
	   d.methodOfClassD();
   }

}
