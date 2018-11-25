package factoryMethod;

import factoryMethod_framework.*;
import factoryMethod_idcard.*;

public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("フレディ・マーキュリー");
		Product card2 = factory.create("スティーブン・タイラー");
		Product card3 = factory.create("ロブ・ハルフォード");
		card1.use();
		card2.use();
		card3.use();
	}

}
