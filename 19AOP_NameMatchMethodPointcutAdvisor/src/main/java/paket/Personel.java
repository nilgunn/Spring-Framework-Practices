package paket;

public class Personel {
	private String adi, soyadi;
	private int tecrube;
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
	public int getTecrube() {
		return tecrube;
	}
	public void setTecrube(int tecrube) {
		this.tecrube = tecrube;
	}
	
	public void adisoyadikontrolet() {
		System.out.println("Personel servisinin kontrol metodu");
		if(adi.length() <2 || soyadi.length() <2 ) {
			throw new IllegalArgumentException();
		}
	}
	public void selamver(String mesaj) {
		System.out.println("Personel servisinin selam ver metodu\nGELEN MESAJ : " + mesaj);
	}
	public void personelbilgisiniver() {
		System.out.println("Personel servisinin personel bilgisini al metodu"
				+ "\nADI SOYADI : "+adi +" "+soyadi+""
				+ "\nTECRÜBE    : "+tecrube+" yıl");
	
	}
	
}
