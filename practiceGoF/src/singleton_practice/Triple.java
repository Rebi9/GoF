package singleton_practice;

public class Triple {
	private static Triple[] triple = new Triple[] {new Triple(0), new Triple(1), new Triple(2)};
	private int id;
	private Triple(int id) {
		this.id = id;
	}
	public Triple getInstance(int id) {
		return triple[id];
	}
}
