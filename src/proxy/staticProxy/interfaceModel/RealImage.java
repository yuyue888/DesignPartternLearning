package proxy.staticProxy.interfaceModel;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("ImageName :" + this.fileName);
    }
}
