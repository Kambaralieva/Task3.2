package com.company;

import java.io.OutputStream;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {0.0, 5.1, -3.1, 7.5, -11.3, -15.6,
                20.8, 25.5, -30.4, 31.2, 96.7, -97.2, 98.2, -54.1, 55.1};
        double sum = 0.0;
        boolean minusNumber = false;
        double result;
        int quantity = 0;

        for (double i : numbers) {
            if (i < 0) {
                minusNumber = true;
            }
            if (minusNumber) {
                if (i > 0) {
                    sum += i;
                    quantity++;
                }
            }


        }
        result = sum / quantity;
        System.out.println("Среднее значение" + " " + result);

    }


}