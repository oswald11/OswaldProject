package snail.oswald.eckel.chapter4;

public class VampireNumbers {

    public static void main(String[] argv) {
        for (int i = 1000; i < 1001; i++) {

            String [] sNums = Integer.toString(i).split("");

            if (i == Integer.parseInt(sNums[0] + sNums[1]) * Integer.parseInt(sNums[2] + sNums[3])){
                System.out.println("Vampire: " + i);
            }
            // TODO: finish

        }
    }
}

