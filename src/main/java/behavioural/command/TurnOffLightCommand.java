package behavioural.command;

public class TurnOffLightCommand implements ICommand {
    private ILight light;
    
    TurnOffLightCommand(final ILight light){
        this.light = light;
    }
    
    public void execute() {
        light.turnOff();

    }

    public void rollback() {
        light.turnOn();
    }

}
