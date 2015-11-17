package AbstractFactory;

/***
 * 抽象工厂模式
 * 提供一系列相关或相互依赖对象的接口，而无需指定他们具体的类。
 * 
 * @author  zheng
 * @version  [version, 2015年3月23日]
 * @see  [about class/method]
 * @since  [product/module version]
 */
public interface IAnimalFactory {
    ICat createCat();
    IDog createDog();
}
