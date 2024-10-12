package OOPs.Inheritance;

// single inheritance
public class BoxWeight extends Box{
    double weight;

    // @Override -- you can not override static methods
    static void greeting(){
        System.out.println("I am in boxweight class");
    }

    BoxWeight(double weight){
        // super();
        this.weight=weight;
        
    }

    BoxWeight(){
        this.weight =-1;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight = weight;
    }

    BoxWeight(Box other){
        this.w = other.w;
    }

    BoxWeight(BoxWeight other){
        super(other);  // referencing to Box(Box old)
        this.weight = other.weight;
    }
}
