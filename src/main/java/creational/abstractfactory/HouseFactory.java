package creational.abstractfactory;

final class HouseFactory {
    
    private HouseFactory(){}
    
    public static House buildHouse(final HouseType ht){
        House house = null;
        HouseLocation hl = HouseLocation.SUBURBS;
        
        switch (hl) {
            case CITY:
                house = CityHouseFactory.buildHouse(ht);
                break;
    
            case COUNTRY:
                house = CountryHouseFactory.buildHouse(ht);
                break;
    
            case SUBURBS:
                house = SuburbHouseFactory.buildHouse(ht);
                break;

    
            default:
                break;
        }
        
        return house;
        
    }
}
