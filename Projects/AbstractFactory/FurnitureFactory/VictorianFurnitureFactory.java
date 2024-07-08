package Projects.AbstractFactory.FurnitureFactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        // TODO Auto-generated method stub
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        // TODO Auto-generated method stub
        return new VictorianSofa();
    }
}
