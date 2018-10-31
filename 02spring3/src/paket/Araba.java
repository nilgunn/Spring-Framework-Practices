package paket;

public class Araba {
	private Yakit yakit;
	public Araba(Yakit yakit) {
		this.yakit = yakit;
	}
	public void hareketegec() {
		yakit.depo();
		System.out.println("Araba harekete gecti.");
	}
}
