package creational.abstractfactory;

public class CountryHouseFactory {
    
    public static House buildHouse(HouseType ht){
        House house = null;
        
        switch (ht) {
            case DETACHED:
                house = new DetachedHouse(HouseLocation.COUNTRY);
                break;
    
            case SEMI:
                house = new SemiDetachedHouse(HouseLocation.COUNTRY);
                break;
    
            case BUNGALOW:
                house = new BungalowHouse(HouseLocation.COUNTRY);
                break;
                
            case COTTAGE:
                house = new CottageHouse(HouseLocation.COUNTRY);
                break;
    
            default:
                break;
        }
        
        return house;
        
    }
}
