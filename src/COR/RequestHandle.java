package COR;

/***
 * 责任链模式
 * 使对个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这些对象练成一条链，并沿着这条链传递该信息，直到有一个对象处理它为止。
 * 这一模式的思想是：给多个对象处理一个请求的机会，从而解耦发送者和接受者。
 * 
 * @author  zheng
 * @version  [version, 2015年3月23日]
 * @see  [about class/method]
 * @since  [product/module version]
 */
public interface RequestHandle {
    void handleRequest(Request request);
}
