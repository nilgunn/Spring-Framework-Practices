package paket;

public class A {
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public A() {
		System.out.println("A sınıfının hazırlayıcı metoodu.");
	}
	public void yaz() {
		System.out.println("---> A sınıfının normal metoodu." + x);
	}
}
