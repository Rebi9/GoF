package factoryMethod_idcard;

import java.util.HashMap;
import java.util.Map;

import factoryMethod_framework.Factory;
import factoryMethod_framework.Product;

public class IDCardFactory extends Factory{
	private Map<Integer, String> ownersData = new HashMap<>();
	private int id = 1;
	protected synchronized Product createProduct(String owner) {
		return new IDCard(owner, id++);
	}
	protected void registerProduct(Product product) {
		IDCard card = (IDCard) product;
		ownersData.put(new Integer(card.getId()), card.getOwner());
	}

	public Map<Integer, String> getOwnersData() {
		return ownersData;
	}

}
