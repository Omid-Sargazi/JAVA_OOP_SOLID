package Projects.AbstractFactory.ComputerFactoryPattern;

public class PC extends Computer {
    public String ram;
    public String hdd;
    public String cpu;

    public PC(String ram, String hdd, String cpu) {
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
    public String getRAM() {
        // TODO Auto-generated method stub
        return ram;
    }

    public String getHDD() {
        return hdd;
    }
}
