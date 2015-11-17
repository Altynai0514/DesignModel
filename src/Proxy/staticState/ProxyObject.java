package Proxy.staticState;

public class ProxyObject implements Object {
	
	private Object proxy;

	public ProxyObject(){
		System.out.println("This is proxy!");
		proxy = new ObjectImpl();
	} 
	
	@Override
	public void action() {
		System.out.println("proxy start..");
		proxy.action();
		System.out.println("proxy end..");
	}

}
