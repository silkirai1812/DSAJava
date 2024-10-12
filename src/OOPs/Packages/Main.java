package OOPs.Packages;

public class Main {
    public static void main(String[] args) {
        Human kiara = new Human(22, "kiara", 10000, false);
        Human ahana = new Human(32, "ahana", 20000, true);
        // System.out.println(kiara.population); -- never call static variables with the help of instance variable 
        // call it with the class name in which the static variable exist,
        //  it will not be wrong to call it via instance variable but convention is to use the class name 
        // System.out.println(ahana.population);
        System.out.println(Human.population);  // this is the correct convention for using static variables

        System.out.println(kiara.name);
        System.out.println(ahana.name);

        Main obj1 = new Main();
        obj1.greeting();
        
        // Main.func();

        // greeting(); //you can't use this bcoz it requires an instance but the funcn we are using it in doesn't depend on instances
    }

    static void func(){
        Main obj1 = new Main();
        obj1.greeting();
        System.out.println("this is a function");
    }

    void greeting(){
        System.out.println("Hello World");
    }
}
