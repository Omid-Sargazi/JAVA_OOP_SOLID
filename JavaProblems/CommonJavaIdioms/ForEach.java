package JavaProblems.CommonJavaIdioms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
