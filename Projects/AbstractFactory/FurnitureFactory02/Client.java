package Projects.AbstractFactory.FurnitureFactory02;

public class Client {
    private Chair chair;
    private Sofa sofa;

    public Client(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
    }

    public void useFurniture() {
        chair.sitOn();
        sofa.lieOn();
    }

    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Client modernClient = new Client(modernFactory);
        modernClient.useFurniture();
    }
}
