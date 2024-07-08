package Projects.AbstractFactory.FurnitureFactory02;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        // TODO Auto-generated method stub
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        // TODO Auto-generated method stub
        return new ModernSofa();
    }
}