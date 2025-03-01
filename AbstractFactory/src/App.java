import Factories.GamingPCFactory;
import Factories.GreenTeamPCFactory;
import Factories.RedTeamPCFactory;

public class App {
    public static void main(String[] args) throws Exception {
        GamingPCFactory myFactory;

        myFactory = new GreenTeamPCFactory();
        myFactory.buildPC();
        myFactory.specialMethod();

        myFactory = new RedTeamPCFactory();
        myFactory.buildPC();
        myFactory.specialMethod();
    }
}
