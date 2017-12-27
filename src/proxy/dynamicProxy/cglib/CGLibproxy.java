package proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGLibproxy implements MethodInterceptor {
    private static CGLibproxy instance = new CGLibproxy();

    private CGLibproxy(){}

    public static CGLibproxy getInstance(){
        return instance;
    }

    public <T> T getProxy(Class<T> clazz){
        return (T) Enhancer.create(clazz ,this);
    }

    public <T> T getProxy(Class<T> clazz ,Class[] argTypes,Object[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return (T) enhancer.create(argTypes ,args);
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(method.getName().equals("delete")){
            System.out.println("---before---");
            Object result = methodProxy.invokeSuper(o , objects);
            System.out.println("---after---");
            return result;
        }
        return null;
    }
}
