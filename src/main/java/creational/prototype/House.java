package creational.prototype;

public class House implements Cloneable {
	private int gears;
	  private HouseType houseType;
	  private int noOfBeds;
	  
	  public House() {
		  houseType = houseType.SEMI;
		  noOfBeds = 3;
	  }
	 
	  public House clone() throws CloneNotSupportedException {
	    return (House) super.clone();
	  }
	 
	  public void makeAdvanced() {
		houseType = houseType.DETACHED;
	    noOfBeds = 10;
	  }
	  
	  public String toString(){
	    return "\n HouseType: " + houseType + "\n Number of Beds: " + noOfBeds;
	  }
}
