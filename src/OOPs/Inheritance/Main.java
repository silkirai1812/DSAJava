package OOPs.Inheritance;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Box box1 = new Box();
        System.out.println(box1.l);

        Box box2 = new Box(4.0);
        System.out.println(box2.l + " " + box2.w + " " + box2.h + " ");

        // Box box3 = new Box(2.0, 4.0, 6.0);
        // System.out.println(box3.l + " " + box3.w + " " + box3.h + " ");

        Box box3 = new Box(box2);
        System.out.println(box3.l + " " + box3.w + " " + box3.h + " ");
        box3.func();

        BoxWeight box4 = new BoxWeight(5.0);
        System.out.println(box4.l + " "+ box4.weight);

        BoxWeight box5 = new BoxWeight(1.0,2.0,3.0,5.0);
        System.out.println(box5.h + " "+ box5.weight);

        Box box6 = new BoxWeight(1.0, 3.0, 4.0, 9.0);
        // only those members can be accessed that are in reference type
        // type of reference variable (not the type of object) determines what members can be accessed
        // here Box can access l h and w variables only because they are present in its definition and not weight 
        System.out.println(box6.l + " "+ box6.w + " "+ box6.h );

        // BoxWeight box = new Box(1.0 ,2.0, 3.0);  --> error because BoxWeight has weight variable and there's no  
        //weight variable in Box so it can't be acceseed 

        BoxWeight box7 = new BoxWeight(box6);
        System.out.println(box7.w);


        BoxPrice box8 = new BoxPrice(2, 4, 5, 50, 200);
        System.out.println(box8.cost);

        // Box box9 = new BoxWeight();
        // box9.greeting(); //it will always print the greting method in box class
        BoxWeight.greeting(); //you can inherit but you can't override

    }
    
}
