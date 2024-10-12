package OOPs.Interfaces.ExtendDemo;

public interface A {

    static void fun2(){ //static interface methid should always have a body
        // call via the interface name 
        System.out.println("Static method in interface A");

    }

    void fun();
}
