package paket;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");
		
		IPersonelServis pers = (IPersonelServis)context.getBean("personelServisBean");
		try {
			pers.adisoyadikontrolet();
			System.out.println();
			
			pers.selamver("Hoşgeldiniz");
			System.out.println();
			
			pers.personelbilgisiniver();
			System.out.println();
		
		}catch(Exception e){
			System.out.println("Personel servisinin kontrol metodunda istisna oluştu.\nİstisna mesajı : "+ e);
		}
		context.close();
	}
}