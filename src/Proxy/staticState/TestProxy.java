package Proxy.staticState;

import org.junit.Test;

public class TestProxy {

	@Test
	public void test() {
		Object obj = new ProxyObject();
		obj.action();
	}

}
