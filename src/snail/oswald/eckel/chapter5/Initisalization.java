package snail.oswald.eckel.chapter5;

class StringParams {
    String s1 = "1", s2;

    StringParams(){
        System.out.println("s1. before " + s1);
        System.out.println("s2. before " + s2);
        s2 = "2";
        System.out.println("s2. after " + s2);
    }
}



public class Initisalization {
    public static void main(String[] argv) {
        StringParams sp = new StringParams();
        System.out.println("s1. after " + sp.s1);
    }

}

