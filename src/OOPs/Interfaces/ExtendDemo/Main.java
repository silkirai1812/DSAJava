package OOPs.Interfaces.ExtendDemo;

public class Main implements B{

    @Override
    public void fun() {
        System.out.println("Function");
    }

    @Override
    public void greet() {
        System.out.println("Hey");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.fun2();
        obj.fun();
    }

}
