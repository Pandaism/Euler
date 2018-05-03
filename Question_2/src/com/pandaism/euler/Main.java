package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/3/2018 : 9:04 AM
 */
public class Main {

    public static void main(String[] args) {
        int limit = 4000000;
        int indexToStart = 3;
        int total = 0;

        for (int i = indexToStart; i < Integer.MAX_VALUE; i += 3) {
            int n = fib(i);
            if(n >= limit) {
                break;
            } else {
                total += n;
            }
        }

        System.out.println(total);
    }

    public static int fib(int index) {
        if(index <= 2) {
            return 1;
        }

        return fib(index - 2) + fib(index - 1);
    }
}
