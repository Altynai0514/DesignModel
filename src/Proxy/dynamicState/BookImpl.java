package Proxy.dynamicState;

public class BookImpl implements Book {
    @Override
    public void update() {
        System.out.println("This is my update book!");
    }
}
