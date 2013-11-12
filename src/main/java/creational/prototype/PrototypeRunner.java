package creational.prototype;

public class PrototypeRunner {

	
	
	public static void main(String args[]) throws CloneNotSupportedException{
	    House house = new House();
	    House house2 = house.clone();
	    PrototypeRunner workShop = new PrototypeRunner();
	    House mansion = workShop.makeHouseAMansion(house2);
	    
	    System.out.println("Prototype Design Pattern: "+ house);
	    System.out.println("Prototype Design Pattern: "+ mansion);
	  }
	
	public House makeHouseAMansion(House house) {
		house.makeAdvanced();
		
	    return house;
	 }

}
