package snail.oswald.eckel.chapter9;

import java.util.Random;

interface Game{
    void play();
}

interface GameFactory{
    Game newGame();
}

class FlipCoin implements Game{
    private Random rand = new Random(16);

    @Override
    public void play() {
        switch (rand.nextInt(2)){
            case 0:
                System.out.println("heads");
                break;
            case 1:
                System.out.println("tails");
                break;
            default:
                System.out.println("on edge");
                break;
        }
    }
}

class FlipCoinFactory implements GameFactory{
    @Override
    public Game newGame() {
        return new FlipCoin();
    }
}

class RollDice implements Game{
    private Random rand = new Random(16);

    @Override
    public void play() {
        System.out.println(rand.nextInt(6) + 1);
    }
}

class RollDiceFactory implements GameFactory{
    @Override
    public Game newGame() {
        return new RollDice();
    }
}


public class Games {
    public static void playGame(GameFactory gf){
        gf.newGame().play();
    }

    public static void main(String[] argv){
        playGame(new FlipCoinFactory());
        playGame(new RollDiceFactory());
    }
}
