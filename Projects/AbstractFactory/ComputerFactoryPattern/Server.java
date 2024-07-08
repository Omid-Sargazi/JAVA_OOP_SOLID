package Projects.AbstractFactory.ComputerFactoryPattern;

public class Server extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getCPU() {
        // TODO Auto-generated method stub
        return cpu;
    }

    @Override
    public String getHDD() {
        // TODO Auto-generated method stub
        return hdd;
    }

    public String getRAM() {
        return ram;
    }

}
