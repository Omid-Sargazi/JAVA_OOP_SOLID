package Projects.AbstractFactory.ProductCurrency;

public class INRFactory implements CurrencyFactory {
    @Override
    public Currency createCurrency() {
        // TODO Auto-generated method stub
        return new INR();
    }
}
