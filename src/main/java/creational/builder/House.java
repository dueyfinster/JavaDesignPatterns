package creational.builder;

public class House {
    private HouseType houseType;
    private int noOfWindows;
    private int noOfDoors;

    House(final HouseType houseType, final int noOfWindows, final int noOfDoors) {
        this.houseType = houseType;
        this.noOfWindows = noOfWindows;
        this.noOfDoors = noOfDoors;
    }

    public String toString() {
        return " HouseType: " + houseType + "\n No of Windows: " + noOfWindows + "\n No of Doors: " + noOfDoors;
    }

    public HouseType getHouseType() {
        return this.houseType;
    }

    public int getNoOfWindows() {
        return this.noOfWindows;
    }

    public int getNoOfDoors() {
        return this.noOfDoors;
    }
}
