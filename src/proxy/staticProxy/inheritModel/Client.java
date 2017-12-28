package proxy.staticProxy.inheritModel;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
    }
}
