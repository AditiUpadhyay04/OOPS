package Interface.Device;

public class SmartPhone implements MusicPlayer,Camera,Phone{
    @Override
    public void clickPhoto() {
        System.out.println("click photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("record video");
    }

    @Override
    public void playMusic() {
        System.out.println("play music");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop Music");
    }

    @Override
    public void callPick() {
        System.out.println("call pick");
    }

    @Override
    public void callEnd() {
        System.out.println("end call");
    }
}

