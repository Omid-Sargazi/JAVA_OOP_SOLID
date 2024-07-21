package Projects.AbstractFactory.FurnitureFactory;

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

    }
}
