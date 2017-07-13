/**
 * Created by petro on 7/13/17.
 */
public class ComputerFactory {
    public static Computer getComputer(AbstractFactory factory){
        System.out.println("getting computer using "+ factory.getClass());
        return factory.createComputer();
    }
}
