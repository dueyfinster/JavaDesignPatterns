package structural.proxy;

public class RealImage implements Image {
    private String fileName;
    
    public RealImage(final String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
    
    public void loadFromDisk(final String fileName){
        System.out.println("Loading " + fileName);
    }

}
