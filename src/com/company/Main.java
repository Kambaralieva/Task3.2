package com.company;

public class Main {
    static double[] numbers = {0.0, 5.1, -3.1, 7.5, -11.3, -15.6,
            20.8, 25.5, -30.4, 31.2, 96.7, -97.2, 98.2, -54.1, 55.1};

    public static void main(String[] args) {
        double plusDigit = 0;
        for (double i : numbers) {
            if (i < 0) {
                plusDigit++;
                continue;
            }
            System.out.println(plusDigit += i);

        }
        System.out.println("Среднее ариф число");
        System.out.println(plusDigit / 9);

    }
}