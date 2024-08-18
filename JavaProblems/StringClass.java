package JavaProblems;

public class StringClass {

    public static int length(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(length("Omid sargazi"));

    }
}
