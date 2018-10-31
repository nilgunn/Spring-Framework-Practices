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
		
		Personel personel01 = new Personel("Aslı","Zemin",5);
		Personel personel02 = new Personel("Berna","Vanlı", 6);
		Personel personel03 = new Personel("Ceyda","Yosun", 2);
		Personel personel04 = new Personel("Demet","Kırmızı", 9);
		Personel personel05 = new Personel("Emre","Bulut", 3);
		Personel personel06 = new Personel("Fatih","Güneş", 2);
		Personel personel07 = new Personel("Gizem","Yaprak", 6);
		Personel personel08 = new Personel("Kemal","Nazlı", 5);
		Personel personel09 = new Personel("Nesrin","Aslan",1);
		Personel personel10 = new Personel("Onur","Yılmaz",1);
		
		List<Personel> personelListesi = new ArrayList<Personel>();
		personelListesi.add(personel01);
		personelListesi.add(personel02);
		personelListesi.add(personel03);
		personelListesi.add(personel04);
		personelListesi.add(personel05);
		personelListesi.add(personel06);
		personelListesi.add(personel07);
		personelListesi.add(personel08);
		personelListesi.add(personel09);
		personelListesi.add(personel10);
		
		System.out.println("EKLENECEK LİSTE \n" + personelListesi);
		System.out.println("\n\n KAYIT ÖNCESİ BÜTÜN KAYITLAR \n" + personelListesi + personelDao.butunKayitlariAra());
		
		//  LİSTEDEKİ KAYITLAR TABLOYA GİRİLİYOR
		personelDao.topluVeriGirisiBatch1(personelListesi);
		System.out.println("\n\n TOPLU VERİ GİRİŞİ VE BÜTÜN KAYITLAR \n" + personelDao.butunKayitlariAra());
		
		// SORGUYA GÖRE YAPILAN GÜNCELLEME İŞLEMİ
		personelDao.topluVeriGirisiBatch2("UPDATE personel SET soyadi = 'Kutlu' WHERE soyadi = 'Yosun'");
		
		System.out.println("\n\n GÜNCELLEME İŞLEMİ VE BÜTÜN KAYITLAR \n" + personelDao.butunKayitlariAra());
		
		c.close();
	}
}
