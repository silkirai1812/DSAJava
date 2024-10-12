package OOPs.Packages;
import OOPs.AccessControls.*;

public class Subclass extends A {

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(10, "xyz");
        int n=obj.num;
        System.out.println(n);
        // A obj1 = new A(10, "xyz");
        // int n1 = obj1.num; -- this is wrong you can access protected num with only 
        // subclass's object and not the parent's class object 
    }
    
}
