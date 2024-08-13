package JavaProblems;

public class StringToDoubleConverter {

    public static double stringToDouble(String input) {
        StringBuilder cleanedInput = new StringBuilder();
        boolean decimalFound = false;
        boolean negativeSignFound = false;

        // Step 1: Clean the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isDigit(currentChar)) {
                cleanedInput.append(currentChar);
            } else if (currentChar == '.' && !decimalFound) {
                cleanedInput.append(currentChar);
                decimalFound = true;
            } else if (currentChar == '-' && i == 0 && !negativeSignFound) {
                cleanedInput.append(currentChar);
                negativeSignFound = true;
            }
        }

        // Step 2: Convert the cleaned string into a double
        double result = 0.0;
        double decimalPlace = 1.0;
        boolean isNegative = false;
        boolean inDecimalPart = false;

        for (int i = 0; i < cleanedInput.length(); i++) {
            char currentChar = cleanedInput.charAt(i);

            if (currentChar == '-') {
                isNegative = true;
            } else if (currentChar == '.') {
                inDecimalPart = true;
            } else {
                int digit = currentChar - '0';

                if (inDecimalPart) {
                    decimalPlace /= 10.0;
                    result += digit * decimalPlace;
                } else {
                    result = result * 10 + digit;
                }
            }
        }

        // Apply the negative sign if necessary
        if (isNegative) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "-12a34.56abc7";
        double result = stringToDouble(input);
        System.out.println("The converted double is: " + result);
    }
}
