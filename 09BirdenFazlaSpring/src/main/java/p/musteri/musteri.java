package p.musteri;

public class musteri {
	public musteri() {
		System.out.println("Müşteri sınıfı");
	}
	String adi, soyadi, tellno;
	Adres adres;
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getTellno() {
		return tellno;
	}
	public void setTellno(String tellno) {
		this.tellno = tellno;
	}
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
}
