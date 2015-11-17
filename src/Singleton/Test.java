package Singleton;


public class Test {
    @org.junit.Test
    public void test() {
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        
        System.out.println(sing1);
        System.out.println(sing2);
    }
}
