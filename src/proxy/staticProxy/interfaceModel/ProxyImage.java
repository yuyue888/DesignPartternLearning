package proxy.staticProxy.interfaceModel;

/**
 * 静态代理 实现接口方式
 * 静态代理其实就是装饰者模式，区别是装饰者模式一般在构造器中传入一个被装饰类，而静态代理则自己创建一个被代理类
 */
public class ProxyImage implements Image {
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        System.out.println("--格式校验--");
        realImage.display();
        System.out.println("--记录日志--");
    }
}
