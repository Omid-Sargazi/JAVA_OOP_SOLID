package Projects.AbstractFactory.ProductCurrency;

public class Main {
    public static void main(String[] args) {
        INRFactory inrFactory = new INRFactory();
        Currency currency = inrFactory.createCurrency();
        System.err.println(currency.getSymbol());
    }
}
