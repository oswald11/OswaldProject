package snail.oswald.eckel.chapter5;

class Camera {
    Camera(){
        System.out.println("Camera contructor with no inputs");
    }

    Camera(String message){
        this();
        System.out.println(message);

    }
}

public class Constructors {

    public static void main(String[] argv) {
        new Camera();
        new Camera("fancy!");
    }
}

