package org.example;

public class Array {

    public static void main(String[] args) {
        int[] a = {7, 6, 3, 8, 5, 9, 5, 7, 6, 3};

        for (int i = 0; i < a.length; i++) {
            int s = a[i];
            if (s %3 == 0) {
                System.out.println("Число кратно трём: " + s);
            }
        }
    }
}
