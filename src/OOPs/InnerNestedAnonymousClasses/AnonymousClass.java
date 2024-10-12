package OOPs.InnerNestedAnonymousClasses;

public class AnonymousClass {
    // normally creating a class via giving name
//    class InnerClass extends OuterClass{

//    }

    // Creating anonymous class
    // by extending superclass
    OuterClass obj = new OuterClass() {
        // void sing(){
        //     System.out.println("I am singing");
        // }

        public void outerMethod(){
            System.out.println("I am in Outer method");
        }
    };

    // by implementing superinterface
    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod(){
        }
    };
    
}

class OuterClass {
    public void outerMethod(){
        System.out.println("Outer class method");
    }
}

interface SuperInterface{
    void interfaceMethod();
}
