package com.mmg.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = 0;
        int secret = random.nextInt(10) + 1;
        System.out.println(secret + "");
        while (secret != number) {
            System.out.println("請輸入一個數字");
            number = scanner.nextInt();
            if (number > secret) {
                System.out.println("低一點");
            } else if (number < secret) {
                System.out.println("高一點");
            } else {
                System.out.println("猜中了!");
            }
        }
    }
}
