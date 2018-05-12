package com.pandaism.euler;

import java.util.ArrayList;

/**
 * @author Pandaism
 * @date 5/11/2018 : 5:22 PM
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;

        for(int loopA = 1; loopA <= 10000; loopA++) {
            int b = getDN(loopA);
            int a = getDN(b);

            if(a == loopA) {
                if(a != b) {
                    if(a < 10000) {
                        if (!list.contains(a)) {
                            list.add(a);
                            sum += a;
                        }
                    }

                    if(b < 10000) {
                        if (!list.contains(b)) {
                            list.add(b);
                            sum += b;
                        }
                    }
                }
            }
        }

        System.out.println(sum);
    }

    private static int getDN(int num) {
        if(num == 1) {
           return 0;
        }

        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                int divide = num / i;
                if(!list.contains(i) && !list.contains(divide)) {
                    if(divide != num) {
                        list.add(divide);
                        sum += divide;
                    }
                    list.add(i);
                    sum += i;
                }
            }
        }

        return sum;
    }

}
