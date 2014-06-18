package creational.prototype;

final class PrototypeRunner {

    private PrototypeRunner(){}
    
    public static void main(final String[] args) throws CloneNotSupportedException{
        House house = new House();
        House house2 = house.clone();
        PrototypeRunner workShop = new PrototypeRunner();
        House mansion = workShop.makeHouseAMansion(house2);
        
        System.out.println("Prototype Design Pattern: "+ house);
        System.out.println("Prototype Design Pattern: "+ mansion);
    }
    
    public House makeHouseAMansion(final House house) {
        house.makeAdvanced();
        
        return house;
    }

}
