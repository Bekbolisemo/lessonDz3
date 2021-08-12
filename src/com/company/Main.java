package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] array = {-3.3, 5.2, -8.4, -9.4, 22.5, -56.9, 37.9, -12.8, 53.4, -54.6, 13.01, 37.62, -53.77, 24.8, -29.04};

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                continue;

            }
            double result = 0;

            for (double d : array) {
                result += d;
            }

            System.out.println(Arrays.deepToString(new double[][]{array}) + " = " + "(" + result / array.length + ")");
        }

    }
}
