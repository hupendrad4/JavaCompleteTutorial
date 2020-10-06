public class WrapperClasses
{
    static void overloadedMethod(Integer I)
    {
        System.out.println("Integer Wrapper Class Type");
    }
 
    static void overloadedMethod(Long L)
    {
        System.out.println("long primitive type");
    }
 
    public static void main(String[] args)
    {
        int i = 21;
 
        overloadedMethod(i);
    }
}