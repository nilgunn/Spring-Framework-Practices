package paket;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.*;
import org.springframework.context.support.*;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonelDAO;
import enterprise.Personel;

public class Merkez {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext c = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		PersonelDAO personelDao = c.getBean("personelDAOBean", PersonelDAO.class);
		
//		Personel personel01 = new Personel("Aslı","Zemin",5);
//		Personel personel02 = new Personel("Berna","Vanlı", 6);
//		Personel personel03 = new Personel("Ceyda","Yosun", 2);
//		Personel personel04 = new Personel("Demet","Kırmızı", 9);
//		Personel personel05 = new Personel("Emre","Bulut", 3);
//		Personel personel06 = new Personel("Fatih","Güneş", 2);
//		Personel personel07 = new Personel("Gizem","Yaprak", 6);
//		Personel personel08 = new Personel("Kemal","Nazlı", 5);
//		Personel personel09 = new Personel("Nesrin","Aslan",1);
//		Personel personel10 = new Personel("Onur","Yılmaz",1);
//		
//		List<Personel> personelListesi = new ArrayList<Personel>();
//		personelListesi.add(personel01);
//		personelListesi.add(personel02);
//		personelListesi.add(personel03);
//		personelListesi.add(personel04);
//		personelListesi.add(personel05);
//		personelListesi.add(personel06);
//		personelListesi.add(personel07);
//		personelListesi.add(personel08);
//		personelListesi.add(personel09);
//		personelListesi.add(personel10);
		
		int rastgeleSayi;
	   // rastgeleSayi = (int)(Math.random()*10);
//	    rastgeleSayi = 21;
//	    
//		Personel personel1 = new Personel();
//		personel1.setAdi("Ali");
//		personel1.setSoyadi("Öz");
//		personel1.setTecrube(rastgeleSayi);
//		
//		System.out.println("CREATE (OLUŞTUR)");
//		personelDao.createOlustur1(personel1);
//		
//		System.out.println("READ (OKU)");
//		personelDao.readOku1(rastgeleSayi);
//		
//		System.out.println("UPDATE (GÜNCELLE)");
//		personel1.setAdi("Selin");
//		personel1.setSoyadi("Altın");
//		personel1.setTecrube(rastgeleSayi);
//		personelDao.updateGuncelle1(personel1, rastgeleSayi);
//		
//		System.out.println("LİSTEDEKİ GÜNCELLEME SONRASI SON DURUM");
//		List<Personel> personelListesi1 = personelDao.getAllHepsiniGetir2();
//		System.out.println(personelListesi1);
//		
//		System.out.println("DELETE (SİLME)");
//	    personelDao.deleteSil1(rastgeleSayi - 2);
//	    personelDao.deleteSil1(rastgeleSayi - 1);
//	    personelDao.deleteSil1(rastgeleSayi);
//	    personelDao.deleteSil1(rastgeleSayi + 1);
//	    personelDao.deleteSil1(rastgeleSayi + 2);
//		
//	    System.out.println("LİSTEDEKİ SİLME SONRASI SON DURUM");
//	    System.out.println(personelDao.getAllHepsiniGetir1());
		
	    rastgeleSayi = 12;
	    Personel personel2 = new Personel();
		personel2.setAdi("Yeşim");
		personel2.setSoyadi("Avşar");
		personel2.setTecrube(rastgeleSayi);
		
		System.out.println("CREATE (OLUŞTUR)");
		personelDao.createOlustur1(personel2);
		
		System.out.println("READ (OKU)");
		personelDao.readOku2(rastgeleSayi);
		
		System.out.println("UPDATE (GÜNCELLE)");
		personel2.setAdi("Melih");
		personel2.setSoyadi("Sert");
		personel2.setTecrube(rastgeleSayi);
		personelDao.updateGuncelle1(personel2, rastgeleSayi);
		
		System.out.println("LİSTEDEKİ GÜNCELLEME SONRASI SON DURUM");
		List<Personel> personelListesi2 = personelDao.getAllHepsiniGetir2();
		System.out.println(personelListesi2);
		
		System.out.println("DELETE (SİLME)");
	    personelDao.deleteSil2(rastgeleSayi - 2);
	    personelDao.deleteSil2(rastgeleSayi - 1);
	    personelDao.deleteSil2(rastgeleSayi);
	    personelDao.deleteSil2(rastgeleSayi + 1);
	    personelDao.deleteSil2(rastgeleSayi + 2);
		
	    System.out.println("\nLİSTEDEKİ SİLME SONRASI SON DURUM");
	    System.out.println(personelDao.getAllHepsiniGetir2());
	    
	    System.out.println("İŞLEM TAMAM");
	    
		c.close();
	}
}
