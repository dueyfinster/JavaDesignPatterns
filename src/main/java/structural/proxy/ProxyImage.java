package structural.proxy;

public class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;
    
    public ProxyImage(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
         }
         realImage.display();
    }

}
