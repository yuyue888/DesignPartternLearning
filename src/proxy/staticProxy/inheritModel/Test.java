package proxy.staticProxy.inheritModel;

import proxy.staticProxy.interfaceModel.Image;
import proxy.staticProxy.interfaceModel.ProxyImage;

public class Test {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
    }
}
