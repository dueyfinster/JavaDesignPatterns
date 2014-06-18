package creational.abstractfactory;

public class SemiDetachedHouse extends House {

    public SemiDetachedHouse(HouseLocation hl) {
        super(HouseType.SEMI, hl);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Build a house attached to one other house");

    }

}
