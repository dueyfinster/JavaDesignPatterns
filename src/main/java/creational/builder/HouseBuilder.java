package creational.builder;

public class HouseBuilder {
    private HouseType houseType;
    private int noOfWindows;
    private int noOfDoors;
    
    public void setHouseType(HouseType houseType){
        this.houseType = houseType;
    }
    
    public void setNoOfWindows(int noOfWindows){
        this.noOfWindows = noOfWindows;
    }
    
    public void setNoOfDoors(int noOfDoors){
        this.noOfDoors = noOfDoors;
    }
    
    public House getResult(){
        return new House(houseType, noOfWindows, noOfDoors);
    }
}
