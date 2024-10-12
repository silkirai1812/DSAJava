package OOPs.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(22);
        son.career("Doctor");
        son.partner("Riya", 22);

        Daughter daughter = new Daughter(23);
        daughter.career("Engineer");
        daughter.partner("Rahul", 24);

        Parent.greeting();
        // Parent parent = new Parent(); -- abstract classes can't be instantiated or we can't create objects for them
        // but Parent can be used as reference variable  Parent daughter = new Daughter(23)


        // you can't create abstract static methods because static methods can't be overridden and abstract methods 
        // need to override so you can't create abstract static methods

        //  but you can make static methods inside abstract classes

    }

}
