package COR;


public class Test {
    @org.junit.Test
    public void test() {
        RequestHandle hr = new HRRequestHandle();
        RequestHandle pm = new PMRequestHandle(hr);
        RequestHandle tl = new TLRequestHandle(pm);
       
        Request request1 = new DismissionRequest();
        tl.handleRequest(request1);
        Request request2 = new AddMoneyRequest();
        tl.handleRequest(request2);
        Request request3 = new LeaveRequest();
        tl.handleRequest(request3);
    }
}
