enum Enums
{
 A , B, C;
 int i=20;
 
 private Enums()
 {
	 
 }
 
 void methodforEnum() {
	 System.out.println("This is Enum Function");
 }
}



public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enums en=Enums.A;
		en.methodforEnum();
		System.out.println(en.i);
		
		Enums en1=Enums.B;
		en1.methodforEnum();
		System.out.println(en1.i);
		
		Enums en2=Enums.B;
		en2.methodforEnum();
		System.out.println(en2.i);
	}

}
