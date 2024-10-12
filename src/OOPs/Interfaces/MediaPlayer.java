package OOPs.Interfaces;

public class MediaPlayer implements Media{

    @Override
    public void start() {
        System.out.println("start media player");
    }

    @Override
    public void stop() {
        System.out.println("stop media player");
    }
    
}
