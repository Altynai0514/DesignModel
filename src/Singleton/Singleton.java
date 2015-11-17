package Singleton;

/***
 * 单例模式
 * 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象
 * 
 * @author  zheng
 * @version  [version, 2015年3月23日]
 * @see  [about class/method]
 * @since  [product/module version]
 */
public class Singleton {
    private static Singleton singleton = null;
    
    /**
     * 构造函数写成private的，从而保证别的类不能实例化此类
     */
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
