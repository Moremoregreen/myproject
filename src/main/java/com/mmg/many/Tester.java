package com.mmg.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        //map
        HashMap<String,String> stocks = new HashMap<>();
        stocks.put("2330","台積電");
        stocks.put("2317","鴻海");
        System.out.println(stocks.get("2330"));
        for (String key:stocks.keySet()){
            System.out.println(stocks.get(key));
        }
//        set();
//        list();
//        arrayTest();
    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(123);
        System.out.println(set);
        for (int n:set){
            System.out.println(n);
        }
    }

    private static void list() {
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
