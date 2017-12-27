package proxy.dynamicProxy.jdk;

public class RealImage implements Image {
    private String fileName ;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("display:"+fileName);
    }

    @Override
    public void delete() {
        System.out.println("delete:"+fileName);
    }
}
