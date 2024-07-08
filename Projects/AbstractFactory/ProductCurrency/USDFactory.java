package Projects.AbstractFactory.ProductCurrency;

public class USDFactory implements CurrencyFactory {
    @Override
    public Currency createCurrency() {
        // TODO Auto-generated method stub
        return new USD();
    }
}
