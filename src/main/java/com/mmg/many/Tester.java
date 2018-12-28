package com.mmg.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(7);
        System.out.println(list);
        System.out.println(list.size());
        List<Integer> scores =
                Arrays.asList(80,90,70,50,40);
        for (int score:scores){
            System.out.println(score);
        }
//        arrayTest();
    }

    private static void arrayTest() {
        int[] numbers = new int[5];
        int[] scores = {1,2,3,5,8,13};
        System.out.println(scores);
        for (int i = 0; i<scores.length ;i++){
            System.out.print(scores[i]+"\t");
        }
        for (int n :scores){
            System.out.print(n+"\t");
        }
    }
}
