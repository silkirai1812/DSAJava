package OOPs.AbstractDemo;

public abstract class Parent { // if you are declaring an abstract method inside a class then you must add the abstract keyword to class as well
    abstract void career(String name);
    abstract void partner(String name, int age);

    // we can't create abstract constructors

    int age;
    public Parent(int age){
        this.age = age;
        System.out.println(age);
    }

    static void greeting(){
        System.out.println("Hello");
    }

    void greeting1(){
        System.out.println("Hello");
    }
}
