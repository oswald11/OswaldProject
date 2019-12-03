package snail.oswald.eckel.chapter3;

public class Dog {
    String name, says;

    public static void main (String[] argv){
        Dog spot = new Dog();
        Dog scruffy = new Dog();

        spot.name = "spot";
        spot.says = "spot";

        scruffy.name = "scruffy";
        scruffy.says = "scruffy";

        System.out.println("spot.name = " + spot.name);
        System.out.println("spot.says = " + spot.says);

        System.out.println("scruffy.name = " + scruffy.name);
        System.out.println("scruffy.says = " + scruffy.says);


        Dog snoopy = new Dog();

        spot = snoopy;

        //System.out.println("spot == snoopy -- " + spot == snoopy); // incompatible types
        System.out.println("spot.equals(snoopy) -- " + spot.equals(snoopy)); // true

    }
}
