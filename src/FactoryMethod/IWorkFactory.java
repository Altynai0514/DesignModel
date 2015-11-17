package FactoryMethod;

/***
 * 简单工厂模式
 * 定义一个用于创建对象的接口，让子类决定实例化哪个类
 * 
 * @author  zheng
 * @version  [version, 2015年3月23日]
 * @see  [about class/method]
 * @since  [product/module version]
 */
public interface IWorkFactory {
    IWork getWork();
}
