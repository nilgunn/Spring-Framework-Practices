package paket;

public class B {
	private A anesne;
	public B(A anesne) {
		System.out.println("B sınıfının hazırlayıcı metoodu.");
		this.anesne = anesne;
	}
	public void yaz() {
		System.out.println("---> B sınıfının normal metoodu.");
		anesne.yaz();
	}
}
