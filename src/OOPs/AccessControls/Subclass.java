package OOPs.AccessControls;

public class Subclass extends A {

    Subclass(int num, String name){
        super(num,name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(10, "ask");
        int n = obj.num;
        System.out.println(n);
    }
    
}
