package paket;

public class Musteri {
	private Siparis siparis;

	public Musteri() {
		System.out.println("Müşteri sınıfının yapılandırıcısı.");
	}

	public Siparis getSiparis() {
		System.out.println("Müşteri sınıfının getSiparis metodu.");
		return siparis;
	}

	public void setSiparis(Siparis siparis) {
		System.out.println("Müşteri sınıfının setSiparis metodu.");
		this.siparis = siparis;
	}
	public void hesabiode() {
		System.out.println("Müşteri sınıfının hesabiode metodu.");
		siparis.toplamSonuc();
	}
}
