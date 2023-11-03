package MainTasks;

import java.math.BigInteger;

public class PrimeNumber {
    public static void main(String[] args) {
        for (Integer a = 2; a < 100; a++) {
            BigInteger bigInteger = BigInteger.valueOf(a);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(a));
            System.out.println(a + " число простое? - " + probablePrime);
        }
    }
}