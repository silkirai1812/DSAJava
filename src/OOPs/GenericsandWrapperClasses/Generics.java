package OOPs.GenericsandWrapperClasses;

public class Generics {
    public static void main(String[] args) {
        Dog<Integer> d1 = new Dog<>(12);
        Dog<String> d2 = new Dog<>("abc123");
        System.out.println(d1.getId());
        System.out.println(d2.getId());


        Cat<Integer, String> c1 = new Cat<>(123,"floria");
        Cat<String, String> c2 = new Cat<>("abc123", "floria");
        System.out.println(c1.getId());
        System.out.println(c2.getName());
    }
}

class Dog<E>{
    private E id;

    public Dog(E id){
        this.id=id;
    }

    E getId(){
        return id;
    }
}

class Cat<E, V>{
    private E id;
    private V name;

    public Cat(E id, V name){
        this.id=id;
        this.name=name;
    }

    E getId(){
        return id;
    }

    V getName(){
        return name;
    }
}
