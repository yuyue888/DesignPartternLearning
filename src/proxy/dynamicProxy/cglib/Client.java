package proxy.dynamicProxy.cglib;

public class Client {
    public static void main(String[] args){
        Image image = ProxyImage.createProxyImage("test.jpg");
        image.display();
        image.delete();
        Image image1 = CGLibproxy.getInstance().getProxy(Image.class , new Class[]{String.class} , new String[]{"test2.png"});
        image1.display();
        image1.delete();
    }
}
