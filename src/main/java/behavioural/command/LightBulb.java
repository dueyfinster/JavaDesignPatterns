package behavioural.command;

public class LightBulb implements ILight {

	public void turnOn() {
		System.out.println("Light is now on");

	}

	public void turnOff() {
		System.out.println("Light is now off");
	}

}
