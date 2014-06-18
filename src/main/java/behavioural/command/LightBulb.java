package behavioural.command;

/**
 * @author Neil Grogan
 *
 * Standard Light Bulb with on and off switch
 *
 */
public class LightBulb implements ILight {

    /**
     *  Turns on the Light Bulb.
     */
    public void turnOn() {
        System.out.println("Light is now on");

    }

    /**
     * Turns off the Light Bulb.
     */
    public void turnOff() {
        System.out.println("Light is now off");
    }

}
