package creational.abstractfactory;

final class HouseFactory {
    private static HouseLocation houseLoc = HouseLocation.SUBURBS;

    private HouseFactory() {
    }

    public static House buildHouse(final HouseType ht) {
        House house = null;

        switch (houseLoc) {
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

    /**
     * Sets the location of where the house is to be built.
     * 
     * @param hl
     */
    public static void setHomeLocation(HouseLocation hl) {
        houseLoc = hl;
    }
}
