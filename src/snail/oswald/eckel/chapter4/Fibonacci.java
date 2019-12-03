package snail.oswald.eckel.chapter4;

public class Fibonacci {

    public static void main(String[] argv) {
        int count = 5;
        int n1 = 1, n2 = 1;

        int sum;

        for (int i = 0; i < count; i++){
            System.out.println(n1);

            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}

