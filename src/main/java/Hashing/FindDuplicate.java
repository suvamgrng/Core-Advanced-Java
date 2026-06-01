package Hashing;

import java.util.HashMap;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5};

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (map.containsKey(num)) {
                System.out.println("Duplicate number found " + num);
                System.out.println(map.values());
            } else {
                map.put(num, true);
            }
        }

    }
}
