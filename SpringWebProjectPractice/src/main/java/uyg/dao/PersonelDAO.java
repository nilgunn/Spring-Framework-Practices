package uyg.dao;

import java.util.List;
import uyg.model.Personel;

public interface PersonelDAO {
	
	public String personelEkle(Personel p);
	public List<Personel> personelAra();
	public List<Personel> personelAra(Personel p);
	public String personelDuzenle(Personel p);
	public String personelSil(Personel p);
}