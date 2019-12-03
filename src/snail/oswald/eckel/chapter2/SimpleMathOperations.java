package snail.oswald.eckel.chapter2;

import java.util.*;

public class SimpleMathOperations {

    public static void main (String[] argv){
        int i,j,k;
        Random rand = new Random(16);

        j = rand.nextInt(100);
        System.out.println("j = " + j);

        k = rand.nextInt(100);
        System.out.println("k = " + k);

        i = j%k;
        System.out.println("i = " + i);

        String s1 = "alf", s2 = "alf";
        System.out.println("s1 == s2 " + s1 == s2); // false
        System.out.println("s1.equals(s2) " + s1.equals(s2)); // true
    }
}
