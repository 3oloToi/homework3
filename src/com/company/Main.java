package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	 double[] massive = {10.2, 25.2, -45.1, 36.9, 48.7, -52.1, 35.5, -47.2, 21.3, 51.3,-20.1, 98.5, 41.3, -74.2,97.1};
        System.out.println("Массив ->" + Arrays.toString(massive));
     double summ = 0;
     int colve = 0;
     boolean otr = false;
        for (double t :massive) {
            if (t<0){
                otr =true;
            }
            if (t>0&& otr==true){
                summ+=t;
                colve++;
            }
        }
        System.out.println("Среднее арифметическое: " + summ/colve);
    }
}
