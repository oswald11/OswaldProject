package snail.oswald.eckel.chapter9;

import static  snail.oswald.eckel.Print.*;

abstract class Spam {
}

class SpamSpam extends Spam{
    public void spam(){
        print("spam");
    }
}


public class E4{

    public static void spam(Spam spam){
        ((SpamSpam)spam).spam();
    }


    public static void main(String[] argv) {
        SpamSpam ss = new SpamSpam();
        spam(ss);
    }
}