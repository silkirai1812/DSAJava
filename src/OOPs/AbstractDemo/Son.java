package OOPs.AbstractDemo;

public class Son extends Parent { // if you are extending a class which is abstract then you will need to override 
    // all those abstract methods that are present inside the class(here in parent class)

    public Son(int age) {
        super(age);
    }

    @Override
    void greeting1(){
        super.greeting1();
    }

    @Override
    void career(String name) {
        System.out.println("i want to become a "+ name);
    }
    
    @Override
    void partner(String name, int age){
        System.out.println("My partner name is:"+ name );
        System.out.println("She is "+age+" years old");
    }
}
