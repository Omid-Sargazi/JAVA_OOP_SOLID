package Projects.AbstractFactory.ProductCurrency;

public class GBPFactory implements CurrencyFactory {
    @Override
    public Currency createCurrency() {
        // TODO Auto-generated method stub
        return new GBP();
    }
}
