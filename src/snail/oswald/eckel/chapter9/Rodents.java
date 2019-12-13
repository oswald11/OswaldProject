package snail.oswald.eckel.chapter9;

<<<<<<< HEAD
public class Rodents {
=======
import java.util.Random;
import static  snail.oswald.eckel.Print.*;

abstract class Rodent {
    String petName;
    Rodent(String name){
        this.petName = name;
        print("Rodent " + petName);

    }

    public void bite(){
        print("Rodent.bite");
   }

   public void getAngry(){
       print("Rodent.getAngry");
   }

    public abstract void beCute();
}


class GuineaPig extends Rodent{
    GuineaPig(String name){
        super(name);
        print("GuineaPig");
    }

    @Override
    public void beCute() {
        print("GuineaPig is a fat cutie");
    }
}

class Hamster extends Rodent{
    Hamster(String name){
        super(name);
        print("Hamster");
    }

    @Override
    public void bite() {
        print("Hamster.bite");
    }

    @Override
    public void beCute() {
        print("Silly Hamster");
    }
}

class RandomRodentGenerator{
    private static Random rand = new Random();

    public Rodent get(String name){
        switch (rand.nextInt(2)){
            default:
            case 0: return new GuineaPig(name);
            case 1: return new Hamster(name);
        }
    }
}

public class Rodents {
    public static void main(String[] argv) {
        RandomRodentGenerator rrg = new RandomRodentGenerator();

        Rodent[] gang = new Rodent[5];

        for (int i = 0; i < gang.length; i++){
            gang[i] = rrg.get("Fluffy"+i);
            gang[i].beCute();
            gang[i].getAngry();
            gang[i].bite();
            print("");
        }
    }
>>>>>>> 22321403ca32e1cd9a3654334a4140339c02f2a2
}
