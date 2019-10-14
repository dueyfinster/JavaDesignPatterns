package behavioural.command;

/**
 * @author Neil Grogan
 *
 *         Standard Light Bulb with on and off switch.
 *
 */
public class LightBulb implements ILight {
    private boolean lightIsOn = false;

    /**
     * Turns on the Light Bulb.
     */
    public void turnOn() {
        this.lightIsOn = true;
    }

    /**
     * Turns off the Light Bulb.
     */
    public void turnOff() {
        this.lightIsOn = false;
    }

    /**
     * Gets the status of the light bulb
     */
    public boolean isLightOn() {
        return this.lightIsOn;
    }

}
