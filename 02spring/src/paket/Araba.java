package paket;

public class Araba {
	private Yakit yakit;
	public Araba() {
		this.yakit = new Yakit();
	}
	public void hareketegec() {
		yakit.depo();
		System.out.println("Araba harekete gecti.");
	}
}
