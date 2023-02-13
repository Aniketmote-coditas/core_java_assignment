package assignment_9;
abstract class Instrument{
    public abstract void play();
}
class Piano extends Instrument{

    @Override
    public void play() {
        System.out.println("Piano is playing tan tan tan ");
    }
}
class Flute extends Instrument{

    @Override
    public void play() {
        System.out.println("Flute is playing toot toot toot");
    }
}
class Guitar extends Instrument{

    @Override
    public void play() {
        System.out.println("Guitar is playing tin tin");
    }
}
public class abstact_class_Instrument_Q2 {
    public static void main(String [] args){
        Instrument [] ins=new Instrument[10];
        for(int i=0;i<3;i++){
           ins[i]=new Piano();
        }
        for(int i=3;i<6;i++){
            ins[i]=new Guitar();
        }
        for(int i=6;i<10;i++){
            ins[i]=new Flute();
        }
        for(int i=0;i<10;i++){
            ins[i].play();
        }

    }
}
