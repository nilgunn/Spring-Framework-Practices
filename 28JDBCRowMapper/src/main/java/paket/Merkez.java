package paket;

import org.springframework.context.*;
import org.springframework.context.support.*;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.PersonelDAO;
import enterprise.Personel;

public class Merkez {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext c = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		PersonelDAO personeldao = c.getBean("personelDAOBean", PersonelDAO.class);
		
		Personel p1;
		
//		System.out.println("\nNESNEYİ VERİTABANINA KAYDETME");
//		p1 = new Personel("SEMA", "AY", 11);
//		personeldao.ekle(p1);
//		System.out.println(p1);
		
//		p1 = new Personel("SEMİH", "BULUT", 6);
//		personeldao.ekle(p1);
//		p1 = new Personel("KAAN", "TAŞ", 4);
//		personeldao.ekle(p1);
//		p1 = new Personel("ÖMER", "YILMAZ", 6);
//		personeldao.ekle(p1);
		
		System.out.println("\nid NUMARASI İLE ARAMA YAPMA");
		p1 = personeldao.idAra(3);
		System.out.println(p1);
		
		System.out.println("\nADI İLE ARAMA YAPMA");
		p1 = personeldao.adiAra("Ali");
		System.out.println(p1);
		
		System.out.println("\nid DEĞERİ İLE STRİNG BİR VERİYİ ÇEKME");
		String gelen = personeldao.idDegeriyleStringBirVeriyiCekme(1);
		System.out.println(gelen);
		
		System.out.println("\nBÜTÜN KAYITLARI GETİREN ARAMA");
		for(Personel kayit : personeldao.butunKayitlariAra()) {
			System.out.println(kayit + "\n-------------------");
		}
		c.close();
	}
}
