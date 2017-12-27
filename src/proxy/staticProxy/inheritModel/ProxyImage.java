package proxy.staticProxy.inheritModel;

/**
 * 静态代理 继承方式
 * 静态代理其实就是装饰者模式，区别是装饰者模式一般在构造器中传入一个被装饰类，而静态代理则自己创建一个被代理类
 */
public class ProxyImage extends Image {
    private RealImage realImage;

    public ProxyImage(String fileName) {
        realImage = new RealImage(fileName);
    }

    @Override
    void display() {
        System.out.println("--格式校验--");
        this.realImage.display();
        System.out.println("--记录日志--");
    }
}
