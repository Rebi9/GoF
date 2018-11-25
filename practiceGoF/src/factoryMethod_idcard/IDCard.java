package factoryMethod_idcard;

import factoryMethod_framework.Product;

public class IDCard extends Product{
	private int id;
	private String owner;
	IDCard(String owner, int id) {
		System.out.println(owner + "(" + id + ")" + "のカードを作ります。");
		this.owner = owner;
		this.id = id;
	}
	public void use() {
		System.out.println(owner + "(" + id + ")" + "のカードを使います。");
	}
	public int getId() {
		return id;
	}
	public String getOwner() {
		return owner;
	}
}
