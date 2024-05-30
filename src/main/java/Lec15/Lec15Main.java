package Lec15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lec15Main {
    public static void main(String[] args) {
        // 1. 배열
        int[] array = {100, 200};

        for(int i = 0; i < array.length; i++) {
            System.out.printf("%s %s", i, array[i]);
        }

        // 2. 컬렉션-List
        List<Integer> numbers = Arrays.asList(100, 200);

        // 3. 컬렉션-map
        Map<Integer, String> oldMap = new HashMap<>();
        oldMap.put(1, "MONDAY");
        oldMap.put(2, "TUESDAY");

        Map.of(1, "MONDAY",2, "TUESDAY");
    }
}
