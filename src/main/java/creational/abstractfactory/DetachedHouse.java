package creational.abstractfactory;

public class DetachedHouse extends House {

	public DetachedHouse(HouseLocation hl) {
		super(HouseType.DETACHED, hl);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Build a house on it's own");

	}

}
