package Proxy.cglib.dynamicState;

public class TextProxy {
    
    public static void main(String[] args) {
        BookCglibProxy bookCglibProxy = new BookCglibProxy();
        BookImpl bookImpl = (BookImpl) bookCglibProxy.getInstance(new BookImpl());
        bookImpl.update();
    }
}
