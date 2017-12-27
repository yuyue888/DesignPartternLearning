package proxy.staticProxy.inheritModel;

public class RealImage extends Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    void display() {
        System.out.println("file name :" +this.fileName);
    }
}
