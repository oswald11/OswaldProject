package snail.oswald.eckel.chapter9;

import static  snail.oswald.eckel.Print.*;

enum Note{
    MIDDLE_C, C_SHARP
}

abstract class Instrument {
    int VALUE = 5;

    abstract void adjust();

    public String toString() {
        return "Instrument";
    }
}

interface Playable{
    // Cannot have method definitions:
    void play(Note n); // Automatically public
}



class Wind extends Instrument implements Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public void adjust() {
        print(this + ".adjust()");
    }

    public String toString() {
        return "Wind";
    }
}

class Percussion extends Instrument implements Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public void adjust() {
        print(this + ".adjust()");
    }

    public String toString() {
        return "Percussion";
    }
}

class Stringed extends Instrument implements Playable {
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public void adjust() {
        print(this + ".adjust()");
    }

    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    // Doesn't care about type, so new types added to the system still work
    // right:
    static void tune(Playable p) {
        // ...
        p.play(Note.MIDDLE_C);
    }

    static void tuneAll(Playable[] e) {
        for (Playable p : e) {
            tune(p);
        }
    }

    public static void main(String[] argv) {
        // Upcasting during addition to the array:
        Playable[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
        tuneAll(orchestra);
    }
}