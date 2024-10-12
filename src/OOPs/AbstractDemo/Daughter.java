package OOPs.AbstractDemo;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println("i want to become a "+ name);
    }
    
    @Override
    void partner(String name, int age){
        System.out.println("My partner name is:"+ name );
        System.out.println("He is "+age+" years old");
    }
}
