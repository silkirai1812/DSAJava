package OOPs.GenericsandWrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        // Integer obj = new Integer(12);
        @SuppressWarnings("unused")
        int s=0; 
        Integer obj = Integer.valueOf(12);
        Integer obj1 = Integer.valueOf("12");
        
        Integer obj2 = 13; //Autoboxing
        int age = obj; // unboxing
        s = obj1+obj2+age;
    }
}
