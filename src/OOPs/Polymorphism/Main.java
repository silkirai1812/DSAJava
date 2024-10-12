package OOPs.Polymorphism;

public class Main { //bydefault every class extends Object class in java

    int num;

    public Main(int num){
        this.num = num;
    }

    @Override
    public String toString(){ // here, toString is getting overriden by the tostring method in Oject class
        return "num = "+num ; 
    }

    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        // Square square = new Square();
        // Circle circle = new Circle();
        

        // if same method is present in both parent and child class then method overriding takes place.
        // What member its able to access is defined by the type of reference variable 
        // overriding is done when the refernce variable you are using is of the superclass and the object is of type 
        // subclass and which particular method is being called that depends on object
        // and which member its abe to access is defined by the type of object
        Shapes square = new Square(); // whatever is the type of object that object type's member will be used 
        // because type of overriding in method depends on what the type of object it is
        square.area(); // it will not print the area method of parent class since object type is Square so it's overriding the Shapes area method
        System.out.println();


        Main obj = new Main(54);
        System.out.println(obj);
    }
}
