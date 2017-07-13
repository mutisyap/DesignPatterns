/**
 * Created by petro on 7/13/17.
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        testAbstractFactory();

    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB SSD", "2.4GHZ" ));

        Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB SSD", "2.9 GHZ"));

        System.out.println("Abstract Factory PC Config::"+pc);

        System.out.println("Abstract Factory Server Config::"+server);

    }
}
