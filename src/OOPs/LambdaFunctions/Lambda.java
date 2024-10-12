package OOPs.LambdaFunctions;

public class Lambda {

    // normal implementation
    // Sample obj = new Sample(){
    //     @Override
    //     public int step(int steps) {
    //         return 2*steps;
    //     }
    // };

    // using lambda expressions
    // Sample obj1 = (int step) -> {
    //     return 2*step;
    // };

    // Sample obj = (int steps) -> 2*steps;

    public static void main(String[] args) {
        Sample obj = (int steps) -> 2*steps;
        System.out.println(obj.step(5));
    }
    
}

    // Functinal Interface
@FunctionalInterface
interface Sample{
    public int step(int steps);
}
