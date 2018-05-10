package com.pandaism.euler;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Pandaism
 * @date 5/10/2018 : 10:37 AM
 *
 * Restroom break Start : 11:13 AM          End : 11:36
 */
public class Main {

    public static void main(String[] args) {
        Map<Long, Long> cache = new TreeMap<>();
        ArrayList<Long> list;
        int limit = 1000000;

        for(int i = 2; i < limit; i++) {
            long temp = i;
            list = new ArrayList<>();
            long length = 1;

            while(temp != 1) {
                if (cache.containsKey(temp)) {
                    length = cache.get(temp);
                    break;
                } else {
                    list.add(temp);
                }

                if(isEven(temp)) {
                    temp /= 2;
                } else {
                    temp = (3 * temp) + 1;
                }
            }

            long size = list.size() + length;
            for(long j : list) {
               if(!cache.containsKey(j)) {
                   int index = list.indexOf(j);
                   cache.put(j, size - index) ;
               }
            }
        }
        System.out.println(getGettest(cache));

    }

    public static long getGettest(Map<Long, Long> map) {
        long value = map.get(2L);

        for (long key : map.keySet()) {
            if (map.get(key) > map.get(value)) value = key;
        }

        return value;
    }

    public static boolean isEven(long num) {
        return num % 2 == 0;
    }
}
