package snail.oswald.eckel.chapter3;

import java.util.Random;

public class FlipCoin {
    public static void flip(){
        Random rand = new Random();
        System.out.println(rand.nextInt(2));
    }

    public static void main (String[] argv){
        FlipCoin.flip();
        FlipCoin.flip();
        FlipCoin.flip();

    }
}
