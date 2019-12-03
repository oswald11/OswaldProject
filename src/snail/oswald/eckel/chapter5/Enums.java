package snail.oswald.eckel.chapter5;

public class Enums {
    public enum Money {
        Hryvna, Zloty, Euro
    }

    public static void main(String[] argv) {
        System.out.println(Money.values());

        for (Money m : Money.values()){
            System.out.println(m + " ordinal " + m.ordinal());
        }
    }
}
