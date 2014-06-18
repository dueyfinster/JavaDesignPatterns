package creational.abstractfactory;

public abstract class House {

    private HouseType houseType;
    private HouseLocation houseLocation;

    public House(HouseType ht, HouseLocation hl){
        this.houseType = ht;
        this.houseLocation = hl;
        orderMaterials();
    }

    private void orderMaterials() {
        System.out.println("Ordering Materials for House: " + houseType.toString() + " which is to be located in: " + houseLocation);
    }
    
    protected abstract void construct();
}
