package COR;



public class HRRequestHandle implements RequestHandle {
    @Override
    public void handleRequest(Request request) {
        if(request instanceof DismissionRequest){
            System.out.println("要离职，人事审批！");
        }
    }
}
