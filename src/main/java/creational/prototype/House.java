package creational.prototype;

public class House implements Cloneable {
    private int gears;
    private HouseType houseType;
    private int noOfBeds;
    private static final int BASIC_NO_BEDS = 3;
    private static final int ADV_NO_BEDS = 3;
      
    public House() {
        houseType = houseType.SEMI;
        noOfBeds = BASIC_NO_BEDS;
    }
     
    public House clone() throws CloneNotSupportedException {
      return (House) super.clone();
    }
   
    public void makeAdvanced() {
      houseType = houseType.DETACHED;
      noOfBeds = ADV_NO_BEDS;
    }
    
    public String toString(){
      return "\n HouseType: " + houseType + "\n Number of Beds: " + noOfBeds;
    }
}
