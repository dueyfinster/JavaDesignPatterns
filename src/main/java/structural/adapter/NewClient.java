package structural.adapter;

public class NewClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The date is: " + getDate());

	}
	
	public static String getDate(){
		return AdapterRunner.getDate();
	}

}
