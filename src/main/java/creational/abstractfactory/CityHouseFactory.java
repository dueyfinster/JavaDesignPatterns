package creational.abstractfactory;

public class CityHouseFactory {
    
    public static House buildHouse(HouseType ht){
        House house = null;
        
        switch (ht) {
            case DETACHED:
                house = new DetachedHouse(HouseLocation.CITY);
                break;
    
            case SEMI:
                house = new SemiDetachedHouse(HouseLocation.CITY);
                break;
    
            case BUNGALOW:
                house = new BungalowHouse(HouseLocation.CITY);
                break;
                
            case COTTAGE:
                house = new CottageHouse(HouseLocation.CITY);
                break;
    
            default:
                break;
        }
        
        return house;
        
    }
}
