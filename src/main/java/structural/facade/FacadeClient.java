package structural.facade;

public class FacadeClient {

	public static void main(String[] args) {
		ComputerFacade cf = new ComputerFacade();
		cf.start();
	}

}
