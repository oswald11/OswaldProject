package snail.oswald.eckel.chapter9;

import snail.oswald.eckel.chapter9.interfaces.Guitar;
import static  snail.oswald.eckel.Print.*;

public class Bass implements Guitar {
    private int strings;

    Bass(int strings){
       this.strings = strings;
       print(this.strings + "-bass");
    }

    @Override
    public Bass plugIn() {
        print("plugged");
        return this;
    }

    @Override
    public Bass tune() {
        for (int i = 1; i <= strings; i++)
            print("tuning " + i + " string");
        return this;
    }

    @Override
    public void play() {
        print("Solar by Miles Davis");
    }

    public static void main(String[] argv) {
        new Bass(4).plugIn().tune().play();
    }
}
