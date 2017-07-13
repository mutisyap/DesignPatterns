/**
 * Created by petro on 7/13/17.
 */
public class ServerFactory implements AbstractFactory {

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
        System.out.println("Creating a Server");
        return new Server(ram, hdd, cpu);
    }
}
