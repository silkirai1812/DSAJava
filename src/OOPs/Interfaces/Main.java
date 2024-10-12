package OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Engine car1 = new Car();
        car1.acc();
        car.brake();
        car.start();
        car.stop();
        car.acc();

        Media carMedia = new Car();
        carMedia.stop(); // it will call the engine one so to resolve this we implement different classes 

        MediaPlayer carMeadia2 = new MediaPlayer();
        carMeadia2.stop();
        carMeadia2.start();

        Nicecar car3 = new Nicecar();
        car3.start();
        car3.startMusic();
        car3.upgradeEngine(car1);
        car3.start();
        
    }

}
