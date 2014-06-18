package creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        HouseBuilder hb = new HouseBuilder(); // create a new builder
        hb.setHouseType(HouseType.DETACHED); // set attribute on builder
        hb.setNoOfDoors(3); // set attribute on builder
        hb.setNoOfWindows(10); // set attribute on builder
        House house = hb.getResult(); // only now do we create a house when all the pieces are in place
        System.out.println(house);
    }

}
