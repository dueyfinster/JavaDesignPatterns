package creational.abstractfactory;

public class BungalowHouse extends House {

	public BungalowHouse(HouseLocation hl) {
		super(HouseType.BUNGALOW, hl);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Build a small house with one floor");

	}

}
