package creational.builder;

public class BuilderRunner {
	public static void main(String[] args) {
		HouseBuilder hb = new HouseBuilder();
		hb.setHouseType(HouseType.DETACHED);
		hb.setNoOfDoors(3);
		hb.setNoOfWindows(10);
		House house = hb.getResult();
		System.out.println(house);
	}

}
