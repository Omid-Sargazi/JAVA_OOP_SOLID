package JavaProblems;

public class StringClass {

    public static int length(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String concatenation(String str1, String str2) {
        char[] result = new char[length(str2) + length(str1)];
        int index = 0;

        for (char c : str1.toCharArray()) {
            result[index++] = c;
        }
        for (char c : str2.toCharArray()) {
            result[index++] = c;
        }
        return new String(result);
    }

    public static boolean Comparing(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(length("Omid sargazi"));
        System.out.println(concatenation("Omid", "Sargazi"));

    }
}
