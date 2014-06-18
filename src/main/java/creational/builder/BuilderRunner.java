package creational.builder;

public class BuilderRunner {
    private static final int NO_OF_DOORS = 3;
    private static final int NO_OF_WINDOWS = 3;

    public static void main(String[] args) {
        HouseBuilder hb = new HouseBuilder(); // create a new builder
        hb.setHouseType(HouseType.DETACHED); // set attribute on builder
        hb.setNoOfDoors(NO_OF_DOORS); // set attribute on builder
        hb.setNoOfWindows(NO_OF_WINDOWS); // set attribute on builder
        House house = hb.getResult(); // only now do we create a house when all the pieces are in place
        System.out.println(house);
    }

}
