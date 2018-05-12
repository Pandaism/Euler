package com.pandaism.euler;

import java.util.ArrayList;

/**
 * @author Pandaism
 * @date 5/12/2018 : 11:20 AM
 *
 * Refactor for more efficient algorithm
 * @date 5/12/2018 : 4:54 PM Will revisit
 */
public class Main {
    private static ArrayList<Integer> abundantNums = new ArrayList<>();
    private static ArrayList<Integer> sumsOfAbundantNums = new ArrayList<>();

    public static void main(String[] args) {
        for(int i = 1; i <= 28123; i++) {
            if(isAbundant(i)) {
                abundantNums.add(i);
            }
        }

        for(int i = 0; i < abundantNums.size(); i++) {
            int a = abundantNums.get(i);
            for(int j = i; j < abundantNums.size() - i; j++) {
                int b = abundantNums.get(j);
                int sum = a + b;
                if(!sumsOfAbundantNums.contains(sum)) {
                    sumsOfAbundantNums.add(sum);
                }
            }
        }

        int sum = 0;

        for(int i = 1; i <= 28123; i++) {
            if(!sumsOfAbundantNums.contains(i)) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    private static boolean isAbundant(int num) {
        return getDivisorsSum(num) > num;
    }

    private static int getDivisorsSum(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        int sum = 1;
        int temp = num;

        for(int i = 2; i <= temp; i++) {
            if(num % i == 0) {
                int result = num / i;
                if(!list.contains(i) && !list.contains(result) && i != num && result != num) {
                    list.add(i);
                    sum += i;
                    if(result != i) {
                        list.add(result);
                        sum += result;
                    }
                }
                temp = result;
            }
        }

        return sum;
    }
}
