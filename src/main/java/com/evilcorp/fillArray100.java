package com.evilcorp;

public class fillArray100 {
    public static void main(String[] args) {
        final int[] fillArray100 = new int[100];
        for (int i = 0; i < fillArray100.length; i++) {
            fillArray100[i] = i + 1;
            System.out.println("fillArray100["+i+"] = " + fillArray100[i]);
        }

    }
}

