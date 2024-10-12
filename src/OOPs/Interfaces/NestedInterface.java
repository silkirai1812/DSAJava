package OOPs.Interfaces;

public class NestedInterface {
    public interface Nested{
        boolean isOdd(int num);
    }
    
}
class B implements NestedInterface.Nested{

        @Override
        public boolean isOdd(int num) {
            return (num&1)== 1;
        }
        
     }

    //  class Main{
    //     public static void main(String[] args) {
    //         B obj = new B();
    //         System.out.println(obj.isOdd(10));
    //     }
    //  }
