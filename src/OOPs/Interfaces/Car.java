package OOPs.Interfaces;

public class Car implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("Brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("Start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("accelerate like a normal car");
    }
    
    
}
