package creational.factory;

public class DetachedHouse extends House {

	public DetachedHouse() {
		super(HouseType.DETACHED);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Build a house on it's own");

	}

}
