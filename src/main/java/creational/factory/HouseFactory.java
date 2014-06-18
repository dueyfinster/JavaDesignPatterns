package creational.factory;

public class HouseFactory {
    
    public static House buildHouse(final HouseType ht){
        House house = null;
        
        switch (ht) {
            case DETACHED:
                house = new DetachedHouse();
                break;
    
            case SEMI:
                house = new SemiDetachedHouse();
                break;
    
            case BUNGALOW:
                house = new BungalowHouse();
                break;
                
            case COTTAGE:
                house = new CottageHouse();
                break;
    
            default:
                break;
        }
        
        return house;
        
    }
}
