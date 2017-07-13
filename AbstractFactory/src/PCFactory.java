/**
 * Created by petro on 7/13/17.
 */
public class PCFactory implements AbstractFactory{

    private String ram;

    private String hdd;

    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        System.out.println("Creating a PC");
        return new PC(ram, hdd, cpu);
    }
}
