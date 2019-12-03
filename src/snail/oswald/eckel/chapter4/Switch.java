package snail.oswald.eckel.chapter4;

public class Switch {

    public static void main (String[] argv){
        for (int i = 0; i < 3; i++){
            switch (i){
                case 0:
                    System.out.println("0");
                case 1:
                    System.out.println("1");
                case 2:
                    System.out.println("2");
                default:
                    System.out.println("default");
            }
        }
    }
}