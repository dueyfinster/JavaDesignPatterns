package creational.builder;

public class House {
    private HouseType houseType;
    private int noOfWindows;
    private int noOfDoors;
    
    House(HouseType houseType, int noOfWindows, int noOfDoors){
        this.houseType = houseType;
        this.noOfWindows = noOfWindows;
        this.noOfDoors = noOfDoors;
    }
    
    public String toString(){
        return " HouseType: " + houseType + "\n No of Windows: " + noOfWindows + "\n No of Doors: " + noOfDoors;
    }
}
