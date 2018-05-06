package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/6/2018 : 5:40 PM
 */
public class Main {

    public static void main(String[] args) {
        int result = 0;

        outer: for(int i = 1; i < Integer.MAX_VALUE; i++) {
            for(int j = 1; j <= 20; j++) {
                if(i % j == 0) {
                    result = i;

                    if(j == 20) {
                        break outer;
                    }
                } else {
                    result = 0;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}
