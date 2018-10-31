package dao;

import java.util.List;

import enterprise.Personel;

public interface PersonelDAO {
	
	public void ekle(Personel personel);
	public Personel idAra(int id);
	public Personel adiAra(String adi);
	public Personel soyadiAra(String soyadi);
	public Personel tecrubeAra(int tecrube);
	
	public List<Personel> butunKayitlariAra();
	public String idDegeriyleStringBirVeriyiCekme(int id);
	

}
