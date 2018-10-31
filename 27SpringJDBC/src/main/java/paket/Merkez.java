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
		p1 = new Personel("ALİ", "YILDIZ", 7);
		personeldao.ekle(p1);
		
		p1 = new Personel("SEMİH", "BULUT", 6);
		personeldao.ekle(p1);
		p1 = new Personel("KAAN", "TAŞ", 4);
		personeldao.ekle(p1);
		p1 = new Personel("ÖMER", "YILMAZ", 6);
		personeldao.ekle(p1);
		
		p1 = personeldao.idAra(4);
		System.out.println(p1);
		
		p1 = personeldao.adiAra("Ali");
		System.out.println(p1);
		
		c.close();
	}

}
