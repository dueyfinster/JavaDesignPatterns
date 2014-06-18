package structural.facade;

public class FacadeClient {

    public static void main(String[] args) {
        ComputerFacade cf = new ComputerFacade(); // Hide low-level details with facade
        cf.start();
    }

}
