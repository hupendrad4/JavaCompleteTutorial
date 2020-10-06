enum enums1
{
    FIRST
    {
        int j = 10;   // Field of FIRST
 
        void methodOfFirst()
        {
            System.out.println(j);  //Field j can be used within the constant body
        }
 
        @Override
        void abstractMethod()
        {
            methodOfFirst();     //methodOfFirst() can be used within the constant body
        }
    },
 
    SECOND
    {
        int k = 20;   //Field of SECOND
 
        void methodOfSecond()
        {
            System.out.println(k);  //Field k can be used within the constant body
        }
 
        @Override
        void abstractMethod()
        {
            methodOfSecond();     //methodOfSecond() can be used within the constant body
        }
    };
 
    int i;   //this field is available in all constants
 
    abstract void abstractMethod();  //this method is available in all constants
}
 
public class EnumsExample
{
    public static void main(String[] args)
    {
       // System.out.println(enums1.FIRST.j);   //Compile time error : Field j is not visible here
 
      //  enums1.FIRST.methodOfFirst();  //Compile time error : methodOfFirst() is not visible here
 
        enums1.FIRST.abstractMethod();
 
        //System.out.println(enums1.SECOND.k);   //Compile time error : Field k is not visible here
 
        //enums1.SECOND.methodOfSecond();  //Compile time error : methodOfSecond() is not visible here
 
        enums1.SECOND.abstractMethod();
    }
}