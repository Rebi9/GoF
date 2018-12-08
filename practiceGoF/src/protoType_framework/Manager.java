package protoType_framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	private Map showcase = new HashMap();
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	public Product create(String protoname) {
		Product p = (Product) showcase.get(protoname);
		return p.createClone();
	}
}
