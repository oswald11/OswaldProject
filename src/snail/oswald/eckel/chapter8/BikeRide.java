package snail.oswald.eckel.chapter8;

class Cycle{
    Cycle (){
        System.out.println("Cycle");
    }

    public void ride(){
        System.out.println("Cycle.ride");
    }
}

class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("Unicycle");
    }

    public void ride(){
        System.out.println("Unicycle.ride");
    }
}

class Bicycle extends Cycle{
    Bicycle(){
        System.out.println("Bicycle");
    }

    public void ride(){
        System.out.println("Bicycle.ride");
    }
}

public class BikeRide {
    public void ride( Cycle c){
        System.out.println("BikeRide.ride");
        c.ride();
    }

    public static void main(String[] argv){
       BikeRide br = new BikeRide();

       br.ride(new Cycle());
       br.ride(new Bicycle());
       br.ride(new Unicycle());

       System.out.println();

       Cycle c = new Cycle();
        c.ride();

       Unicycle u = new Unicycle();
       u.ride();

       c = u;
       c.ride();


    }
}
