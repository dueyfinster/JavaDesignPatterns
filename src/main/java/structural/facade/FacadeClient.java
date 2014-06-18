package structural.facade;

final class FacadeClient {

    private FacadeClient(){}

    public static void main(final String[] args) {
        ComputerFacade cf = new ComputerFacade(); // Hide low-level details with facade
        cf.start();
    }

}
