package OOPs.GenericsandWrapperClasses;

public class GenericMethods {
    // in order to create generic methods you need not create a generic class

    public static void main(String[] args) {
        printData(123);
        printData("no");
        GenericMethods obj = new GenericMethods();
        obj.function(12);
    }
    
    static <E> void printData(E data){
        System.out.println(data);
    }

    <E> void function(E data){
        System.out.println(data);
    }

}
