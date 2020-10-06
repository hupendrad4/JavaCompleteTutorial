 class OuterClass1
{
    int x = 10;
 
    static int y = 20;
 
    class InnerClass
    {
        int x = 30;
 
        static final int y = 40;
 
        void methodOfInnerClass()
        {
            System.out.println(x);  //output : 30
 
            System.out.println(y);  //output : 40
 
            //accessing non-static hidden outer class variable in inner class
 
            System.out.println(OuterClass1.this.x);  //Output : 10
 
            //accessing static hidden outer class variable in inner class
 
            System.out.println(OuterClass1.this.y);   //Output : 20
 
            //OR
 
            System.out.println(OuterClass1.y);  //Output : 20
 
        }
    }
}
 
public class Shadowing
{
 
    public static void main(String[] args)
    {
    	OuterClass1 outer = new OuterClass1();
 
    	OuterClass1.InnerClass test=  outer.new InnerClass();
    	test.methodOfInnerClass();
    }
}