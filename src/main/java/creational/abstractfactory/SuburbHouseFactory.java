package creational.abstractfactory;

final class SuburbHouseFactory {

    private SuburbHouseFactory(){};
    
    public static House buildHouse(final HouseType ht){
        House house = null;
        
        switch (ht) {
            case DETACHED:
                house = new DetachedHouse(HouseLocation.SUBURBS);
                break;
    
            case SEMI:
                house = new SemiDetachedHouse(HouseLocation.SUBURBS);
                break;
    
            case BUNGALOW:
                house = new BungalowHouse(HouseLocation.SUBURBS);
                break;
                
            case COTTAGE:
                house = new CottageHouse(HouseLocation.SUBURBS);
                break;
    
            default:
                break;
        }
        
        return house;
        
    }
}
