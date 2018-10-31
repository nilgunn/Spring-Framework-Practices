package impl;

import paket.IPersonelServis;
public class PersonelServisImpl implements IPersonelServis {
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
	@Override
	public void adisoyadikontrolet() {
		System.out.println("Personel servisinin adisoyadikontrolet() metodu");
		if(adi.length() <2 || soyadi.length() <2 ) {
			throw new IllegalArgumentException();
		}
	}
	@Override
	public String selamver(String mesaj) {
		
		System.out.println("Personel servisinin selam ver metodu\nGELEN MESAJ : " + mesaj);
		return mesaj;
	}
	@Override
	public void personelbilgisiniver() {
		System.out.println("Personel servisinin personel bilgisini al metodu"
				+ "\nADI SOYADI : "+adi +" "+soyadi+""
				+ "\nTECRÜBE    : "+tecrube+" yıl");
	
	}
}
