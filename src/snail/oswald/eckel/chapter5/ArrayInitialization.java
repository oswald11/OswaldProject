package snail.oswald.eckel.chapter5;

class Drink{
    Drink(String name){
        System.out.println("Hi, i'm " + name);
    }

    // variable length (dynamic) array
    public void printIngridients(String... ingridients){
        for (String ingridient : ingridients)
            System.out.println(ingridient);
    }
}


public class ArrayInitialization {

    public static void main(String[] argv) {
        //Drink[] drinks = new Drink[3];
        Drink[] drinks = new Drink[] {new Drink("Pepsi"), new Drink("Cocke"), new Drink("Chairman's Reserve")};

        for (Drink d : drinks){
            System.out.println(d);
        }

        drinks[2].printIngridients("rum", "joy");
    }
}
