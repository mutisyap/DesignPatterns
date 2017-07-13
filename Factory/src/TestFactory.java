/**
 * Created by petro on 7/13/17.
 */
public class TestFactory {
    public static void main(String[] args) {
        Computer pc  = Factory.getComputer("pc", "2 GB", "500 GB", "2.4GHZ");

        Computer server = Factory.getComputer("Server", "16 GB", "250 GB SSD", "2.9GHz");

        System.out.println("Factory pc Config::"+pc);

        System.out.println("factory Server Config::"+server);
    }
}
