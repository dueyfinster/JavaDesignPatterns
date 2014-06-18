package creational.abstractfactory;

public class AbstractHouseFactoryPatternRunner {
    public static void main(String[] args) {
        System.out.println(HouseFactory.buildHouse(HouseType.DETACHED) + "\n");
        System.out.println(HouseFactory.buildHouse(HouseType.SEMI) + "\n");
        System.out.println(HouseFactory.buildHouse(HouseType.BUNGALOW) + "\n");
        System.out.println(HouseFactory.buildHouse(HouseType.COTTAGE));
    }
}
