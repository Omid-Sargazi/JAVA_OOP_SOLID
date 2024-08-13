package JavaProblems;

public class StringToInt {
    public static void main(String[] args) {
        String str = "omid1235odc";
        int num = 0;
        int count = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if ((str.charAt(i) - '0') >= 0 && str.charAt(i) - '0' <= 9)

            {
                System.out.println(str.charAt(i) - '0');
                num += (str.charAt(i) - '0') * count;
                count *= 10;
            }
        }
        System.out.println(num + "num");

    }
}
