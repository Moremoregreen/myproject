package com.mmg.Test;

public class meeting {
    public static void main(String[] args) {
        int num[] = {10, 20, 5, 8, 35, 66, 80, 90};
        int min = num[0];
        int max = num[0];
        double ave;
        double sum = 0;

        for (int i = 0; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }
            if (max < num[i]) {
                max = num[i];
            }
            sum += num[i];
        }
        ave = sum / num.length;
        System.out.println("MAX:" + max + "\t MIN:" + min + "\t ave = " + ave);
    }
}