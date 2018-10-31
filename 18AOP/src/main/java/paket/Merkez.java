package paket;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		Personel pers =context.getBean("beanpersproxy", Personel.class);
		try {
			pers.adisoyadikontrolet();
			pers.selamver("Hoşgeldiniz");
			pers.personelbilgisiniver();
		}catch(Exception e){
			System.out.println("Personel servisinin kontrol metodunda istisna oluştu.\nİstisna mesajı : "+ e);
		}
		context.close();
	}
}