package com.interviewPrep.epi.Chap12HashTables;

import java.util.Random;

public class Twelve3LRUCacheTester {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(5);
        Random r = new Random();
        int[] isbns = new int[5];
        for(int i = 0; i < 5; i++){
            int isbn = r.nextInt((int)Math.pow(10, 10));
            isbns[i] = isbn;
            int price = r.nextInt(500);
            cache.put(isbn, price);
        }

        cache.put(r.nextInt((int)Math.pow(10, 10)), r.nextInt(500));

        System.out.println(cache.get(isbns[1]));
        System.out.println(cache.get(isbns[2]));
        System.out.println(cache.get(isbns[3]));
        System.out.println(cache.get(isbns[4]));
        System.out.println(cache.get(isbns[0]));

    }
}
