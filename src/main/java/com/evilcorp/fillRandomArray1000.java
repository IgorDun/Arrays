package com.evilcorp;

import java.util.concurrent.ThreadLocalRandom;

public class fillRandomArray1000 {
    public static void main(String[] args) {
        final int[] fillRandomArray1000 = new int[1000];
        for (int i = 0; i < fillRandomArray1000.length; i++) {
            final int randomInt = ThreadLocalRandom.current().nextInt(1, 1_000_000);
            fillRandomArray1000[i] = randomInt;
            System.out.println("fillRandomArray1000["+i+"] = " + fillRandomArray1000[i]);
        }
    }
}
