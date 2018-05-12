package com.pandaism.euler;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Pandaism
 * @date 5/11/2018 : 9:58 PM
 */
public class Main {
    public static void main(String[] args) {
        String line = "";
        try {
            InputStream inputStream = new FileInputStream(new File("p022_names.txt"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            line = reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] nameArray = line.split(",");
        Map<String, Integer> nameMap = new TreeMap<>();
        for(String s : nameArray) {
            String name = s.replace("\"", "");
            nameMap.put(name, 0);
        }

        int counter = 1;
        for(String key : nameMap.keySet()) {
            char[] chars = key.toCharArray();
            int sum = 0;
            for(char c : chars) {
                sum += (Character.getNumericValue(c) - 9);
            }
            sum *= counter;
            counter++;

            nameMap.put(key, sum);
        }

        long result = 0;
        for(String key : nameMap.keySet()) {
            result += nameMap.get(key);
        }

        System.out.println(result);
    }
}
