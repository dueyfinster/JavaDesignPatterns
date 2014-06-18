package creational.abstractfactory;

public class DetachedHouse extends House {

    public DetachedHouse(final HouseLocation hl) {
        super(HouseType.DETACHED, hl);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Build a house on it's own");

    }

}
