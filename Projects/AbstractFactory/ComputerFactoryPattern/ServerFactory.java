package Projects.AbstractFactory.ComputerFactoryPattern;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        // TODO Auto-generated method stub
        return new Server(ram, hdd, cpu);
    }
}
