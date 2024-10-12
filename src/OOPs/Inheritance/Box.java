package OOPs.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("i amm in box class");
    }

    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    // cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    Box(BoxWeight old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public void func(){
        System.out.println("Box is the base class");
    }
}
