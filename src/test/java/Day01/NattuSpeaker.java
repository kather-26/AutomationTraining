package Day01;

public class NattuSpeaker extends Speaker{
    public static void main(String[] args){
        NattuSpeaker spk=new NattuSpeaker();
        spk.play();
        spk.pause();
        spk.volumeUp();
        spk.volumeDown();
        spk.powerOff();
        spk.powerOn();
    }
}
