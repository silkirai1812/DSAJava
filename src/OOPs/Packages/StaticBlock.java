package OOPs.Packages;

public class StaticBlock {

    static class Test{
        // static String name;
        String name;
        Test(String name){
            this.name=name;
        }
    }

    static int a=4;
    static int b;

    //will run only once when the first object is created i.e when clss is loaded for the first time
    static{
        System.out.println("static block initialised");
        b=a*4;
    }

    public static void main(String[] args) {

        Test ob = new Test("ria");
        Test ob1 = new Test("tia");
        
        System.out.println(ob.name);
        System.out.println(ob1.name);

        System.out.println("a="+a); 
        
        StaticBlock.b += 3;
        System.out.println(StaticBlock.b);

        // StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.b);

    }
}
