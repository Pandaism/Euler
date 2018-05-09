package com.pandaism.euler;

import java.util.ArrayList;

/**
 * @author Pandaism
 * @date 5/9/2018 : 1:51 PM
 *
 * CODE IS NOT EFFICIENT REDO
 * @date 5/9/2018 : 6:05 PM
 */
public class Main {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        for(long l = 1; l < Long.MAX_VALUE; l++) {
            long tri = triangleNum(l);

            if(!isPrime(tri)) {
                long size = divisorSize(tri);
                System.out.println(tri);
                if (size > 500) {
                    System.out.println("Answer: " + tri);
                    System.out.println("Time: " + (System.currentTimeMillis() - start));
                    break;
                }
            }
        }
    }

    private static boolean isPrime(long num) {
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; Math.pow(i, 2) <= num; i++) {
            if(num % i == 0) return false;
        }

        return true;
    }

    private static int divisorSize(long num) {
        ArrayList<Long> holder = new ArrayList<>();
        for (long i = 1; i <= num; i++) {
            if(num % i == 0) {
                long result = num / i;
                if (!holder.contains(result) && !holder.contains(i)) {
                    holder.add(result);
                    holder.add(i);
                }
            }
        }
        return holder.size();
    }

    private static long triangleNum(long num) {
        return (num * (num + 1)) / 2;
    }

//    private static long triangleNum(long num) {
//        if(num <= 1) {
//            return 1;
//        }
//
//        return triangleNum(num - 1) + num;
//    }
}
