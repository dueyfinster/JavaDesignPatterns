package creational.factory;

public class BungalowHouse extends House {

    public BungalowHouse() {
        super(HouseType.BUNGALOW);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Build a small house with one floor");

    }

}
