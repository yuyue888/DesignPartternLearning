package proxy.staticProxy.interfaceModel;

public class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
    }
}
