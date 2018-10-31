package paket;

public class Siparis {
	int tutar;
	public Siparis() {
		System.out.println("Sipariş sınıfının yapılandırıcısı.");
	}

	public int getTutar() {
		return tutar;
	}

	public void setTutar(int tutar) {
		this.tutar = tutar;
	}
	public void toplamSonuc() {
		System.out.println("Sipariş sınıfının toplam sonucu al metodu.");
		System.out.println("Toplam : "+ tutar);
	}
}
