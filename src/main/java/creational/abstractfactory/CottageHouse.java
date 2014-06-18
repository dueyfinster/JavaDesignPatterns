package creational.abstractfactory;

public class CottageHouse extends House {

    public CottageHouse(HouseLocation hl) {
        super(HouseType.COTTAGE, hl);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Build a small house with one floor and thatched roof");

    }

}
