package Day01;

public class Speaker implements Volume,Power,PlayPause {
    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void powerOn() {
        System.out.println("PowerOn");
    }

    @Override
    public void powerOff() {
        System.out.println("PowerOff");
    }

    @Override
    public void volumeUp() {
        System.out.println("VolumeUp");
    }

    @Override
    public void volumeDown() {
        System.out.println("VolumeDown");
    }
}
