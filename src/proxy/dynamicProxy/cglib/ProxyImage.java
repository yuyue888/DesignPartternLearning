package proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

public class ProxyImage {
    public static Image createProxyImage(String fileName){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Image.class); //设置父类型
        Image image = new Image(fileName);
        enhancer.setCallback((InvocationHandler) (o, method, objects) -> { //setCallback可传入一个实现InvocationHandler或MethodInterceptor等继承自Callback的接口的对象
            if(method.getName().equals("display")){
                System.out.println("--身份认证--");
                method.invoke(image, objects);//调用真实对象的方法
                System.out.println("--记录日志--");
            }else {
                method.invoke(image, objects);
            }
            return null;
        });
        Image imageProxy =(Image) enhancer.create();//创建代理对象
        System.out.println("代理类名称："+ imageProxy.getClass().getName());
        return imageProxy;
    }
}
