class shadow{
	
    static 	int i=10;    
	int j=5;
	
	
	void methodOne(int i,int j) {
		
		System.out.println(i);
		System.out.println(shadow.i);
		System.out.println(this.j);
	}
}


public class ShadowingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		shadow sh=new shadow();
		sh.methodOne(21,25);
		
	}

}
