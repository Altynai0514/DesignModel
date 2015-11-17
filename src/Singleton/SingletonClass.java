package Singleton;

/***
 * 上面的代码很清楚，也很简单。然而就像那句名言：“80%的错误都是由20%代码优化引起的”。
 * 单线程下，这段代码没有什么问题，可是如果是多线程，麻烦就来了。我们来分析一下：
 * 
 * 线程A希望使用SingletonClass，调用getInstance()方法。
 * 因为是第一次调用，A就发现instance是null的，于是它开始创建实例，
 * 就在这个时候，CPU发生时间片切换，线程B开始执行，它要使用SingletonClass，调用getInstance()方法，
 * 同样检测到instance是null——注意，这是在A检测完之后切换的，也就是说A并没有来得及创建对象——因此B开始创建。
 * B创建完成后，切换到A继续执行，因为它已经检测完了，所以A不会再检测一遍，它会直接创建对象。
 * 这样，线程A和B各自拥有一个SingletonClass的对象——单例失败！
 * 
 * 
 * 在这一版本的单例模式实现代码中，我们使用了Java的静态内部类。这一技术是被JVM明确说明了的，因此不存在任何二义性。
 * 在这段代码中，因为SingletonClass没有static的属性，因此并不会被初始化。
 * 直到调用getInstance()的时候，会首先加载SingletonClassInstance类，这个类有一个static的SingletonClass实例，
 * 因此需要调用SingletonClass的构造方法，然后getInstance()将把这个内部类的instance返回给使用者。
 * 由于这个instance是static的，因此并不会构造多次。
 * 由于SingletonClassInstance是私有静态内部类，所以不会被其他类知道，
 * 同样，static语义也要求不会有多个实例存在。并且，JSL规范定义，类的构造必须是原子性的，非并发的，
 * 因此不需要加同步块。同样，由于这个构造是并发的，所以getInstance()也并不需要加同步。
 * @author  zheng
 * @version  [version, 2015年5月13日]
 * @see  [about class/method]
 * @since  [product/module version]
 */
public class SingletonClass {
    
      private static class SingletonClassInstance { 
        private static final SingletonClass instance = new SingletonClass(); 
      } 

      public static SingletonClass getInstance() { 
        return SingletonClassInstance.instance; 
      } 
    
      private SingletonClass() { 
    
      } 
      
}
