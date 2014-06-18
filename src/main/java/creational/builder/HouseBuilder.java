package creational.builder;

public class HouseBuilder {
    private HouseType houseType;
    private int noOfWindows;
    private int noOfDoors;
    
    public void setHouseType(final HouseType houseType){
        this.houseType = houseType;
    }
    
    public void setNoOfWindows(final int noOfWindows){
        this.noOfWindows = noOfWindows;
    }
    
    public void setNoOfDoors(final int noOfDoors){
        this.noOfDoors = noOfDoors;
    }
    
    public House getResult(){
        return new House(houseType, noOfWindows, noOfDoors);
    }
}
