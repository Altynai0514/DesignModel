package Proxy.dynamicState;

public class TestProxy {
    
    public static void main(String[] args) {
        BookProxy proxy = new BookProxy();
        Book book = (Book)proxy.bind(new BookImpl());
        book.update();
    }
    
}
