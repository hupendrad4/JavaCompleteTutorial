
class A{
	
 int i=20;
}






public class FinalArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     final int x[]=new int[10];
      
      x[2]=20;
      x[3]=30;
      
   //  x=new int[30];
      x[2]=5;
    
      System.out.println(x[2]);
      
final A a=new A();
      System.out.println(a.i);
      a.i=25;
      System.out.println(a.i);
    //  a=new A();
      
	}

}
