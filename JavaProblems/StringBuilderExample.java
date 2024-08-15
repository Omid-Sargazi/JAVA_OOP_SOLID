package JavaProblems;

public class StringBuilderExample {
    public static void main(String[] args) {
        String houseNumber = "521";
        String streetNumber = "Maple Street";
        String city = "Lux";
        String state = "IL";
        String zipCode = "62704";

        StringBuilder addressBuilder = new StringBuilder();

        addressBuilder.append(houseNumber).append(",");
        addressBuilder.append(streetNumber).append(",");
        addressBuilder.append(city).append(", ");
        addressBuilder.append(state).append(" ");
        addressBuilder.append(zipCode);

        String fullAddress = addressBuilder.toString();

        System.out.println("Full Address: " + fullAddress);

        addressBuilder.insert(0, "Apt 4B, ");
        System.out.println("Address with Apartment: " + addressBuilder.toString());

    }
}
