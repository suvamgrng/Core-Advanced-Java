package Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**Store and display*/
public class Demo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Google");
        set.add("Netflix");
        set.add("Meta");

        set.forEach(company -> System.out.println("Company: " + company));
    }
}
