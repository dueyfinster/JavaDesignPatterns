package creational.factory;

public class CottageHouse extends House {

    public CottageHouse() {
        super(HouseType.COTTAGE);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Build a small house with one floor and thatched roof");

    }

}
