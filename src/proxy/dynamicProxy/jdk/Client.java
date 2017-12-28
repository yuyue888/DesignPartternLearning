package proxy.dynamicProxy.jdk;

public class Client {
    public static void main(String[] args){
        Image image1 = ProxyImageHandler.createImage("test.jpg");
        image1.display();
        image1.delete();
    }
}
