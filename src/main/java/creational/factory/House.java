package creational.factory;

public abstract class House {

    private HouseType houseType;

    public House(final HouseType ht){
        this.houseType = ht;
        orderMaterials();
    }

    private void orderMaterials() {
        System.out.println("Ordering Materials for House: " + houseType.toString());
    }
    
    protected abstract void construct();
}
