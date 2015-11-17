package Proxy.dynamicState;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 * jdk动态代理
 * 
 * @author  zheng
 * @version  [version, 2015年11月1日]
 * @see  [about class/method]
 * @since  [product/module version]
 */
public class BookProxy implements InvocationHandler {
    
    private Object target;
    
    /*
     * 绑定委托对象并返回一个代理类
     */
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    
    @Override
    public Object invoke(Object proxy, Method method,
            Object[] args) throws Throwable {
        Object result = null;
        System.out.println("proxy start..");
        result = method.invoke(target, args);
        System.out.println("proxy end..");
        return result;
    }
}
