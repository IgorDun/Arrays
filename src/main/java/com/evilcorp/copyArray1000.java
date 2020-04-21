package com.evilcorp;

import java.util.concurrent.ThreadLocalRandom;

public class copyArray1000 {
    public static void main(String[] args) {
        final int[] originArray1000 = new int[1000];
        for (int i = 0; i < originArray1000.length; i++) {
            final int randomInt = ThreadLocalRandom.current().nextInt(1, 1_000_000);
            originArray1000[i] = randomInt;
        }
        int[] copyArray1000 = new int[1000];
        for (int i = 0; i < copyArray1000.length; i++) {
            copyArray1000[i] = originArray1000[i];
        }
    }
}
