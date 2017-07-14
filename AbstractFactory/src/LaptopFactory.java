/**
 * Created by petro on 7/13/17.
 */
public class LaptopFactory implements AbstractFactory {

    private String ram;

    private String hdd;

    private String cpu;

    public LaptopFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        System.out.println("Creating a Laptop");
        return new PC(ram, hdd, cpu);
    }
}
