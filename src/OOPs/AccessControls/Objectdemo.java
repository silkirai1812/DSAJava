package OOPs.AccessControls;

public class Objectdemo {
    int num;
    public Objectdemo(int num){
        this.num = num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // return super.equals(obj);
        return this.num == ((Objectdemo)obj).num;
    }

    @Override
    protected void finalize() throws Throwable {
        // super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    public static void main(String[] args) {
        Objectdemo obj1 = new Objectdemo(34);
        Objectdemo obj2 = new Objectdemo(34);
        System.out.println(obj1.hashCode());
        System.out.println(obj1.equals(obj2));
    }
}
