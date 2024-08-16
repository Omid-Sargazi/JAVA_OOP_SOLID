package JavaProblems.CommonJavaIdioms;

public class StringBuilderr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i).append(", ");
        }

        System.out.println(sb.toString());
    }
}
