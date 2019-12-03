package snail.oswald.eckel.chapter7;


class Food{
    Food(){
        System.out.println("Here comes food!");
    }
}

class Plate {
    Food f;

    Plate() {
        System.out.println("Lonley empty plate..");
    }

    public void use() {
        // отложенная инициализация
        f = new Food();
        System.out.println("Yummy!");
    }
}


public class Composition {

    public static void main(String[] argv) {
        Plate plate = new Plate();
        plate.use();
    }

}
