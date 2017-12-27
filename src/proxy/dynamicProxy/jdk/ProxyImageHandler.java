package proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用于生成代理类
 * 使用jdk动态代理
 */
public class ProxyImageHandler implements InvocationHandler {
    private Image realImage;

    private ProxyImageHandler(String fileName) {
        this.realImage = new RealImage(fileName);
    }

    /**
     * 通过Proxy的newProxyInstance方法来创建我们的代理对象
     * 第一个参数 一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
     * 第二个参数 一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
     * 第三个参数 一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
     * @param fileName
     * @return
     */
    public static Image createImage(String fileName){
        Image image = (Image) Proxy.newProxyInstance(Image.class.getClassLoader(), new Class[]{Image.class},new ProxyImageHandler(fileName) );
        System.out.println("动态创建对象类名为："+image.getClass().getName());
        return image;
    }

    /**
     *
     * @param proxy 指代我们所代理的那个真实对象
     * @param method 指代的是我们所要调用真实对象的某个方法的Method对象
     * @param args 指代的是调用真实对象某个方法时接受的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("display")){
            System.out.println("--身份认证--");
            method.invoke(this.realImage , args);//调用真实对象的方法
            System.out.println("--记录日志--");
        }else {
            method.invoke(this.realImage , args);
        }
        return null;
    }
}
