package OOPs.InnerNestedAnonymousClasses;

import OOPs.InnerNestedAnonymousClasses.InnerAndNestedClass.Toy;
import OOPs.InnerNestedAnonymousClasses.InnerAndNestedClass.Toy2;

public class Main {
    public static void main(String[] args) {
        InnerAndNestedClass obj = new InnerAndNestedClass();
        // Toy toy = new InnerAndNestedClass().new Toy();
        Toy toy = obj.new Toy();
        toy.price  = 45;

        Toy2 toy2 = new Toy2();
        toy2.price = 55;

        System.out.println();
        System.out.println(toy.price);
        System.out.println(toy2.price);
    }
}
