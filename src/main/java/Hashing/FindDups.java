package Hashing;

import java.util.HashSet;

public class FindDups {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,5};
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (set.contains(num)) {
                System.out.println("Found duplicate element: " + num);
            } else {
                set.add(num);
            }
        }
        System.out.println(set);
    }
}
