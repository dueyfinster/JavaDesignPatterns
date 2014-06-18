package creational.factory;

public class SemiDetachedHouse extends House {

    public SemiDetachedHouse() {
        super(HouseType.SEMI);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Build a house attached to one other house");

    }

}
