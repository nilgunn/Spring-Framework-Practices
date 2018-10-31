package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import p.musteri.musteri;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\09BirdenFazlaSpring\\src\\main\\resources\\SpringBeansTumModuller.xml");
		musteri muster = cont.getBean("beanmusteri", musteri.class);
		System.out.println(" Adı: "+muster.getAdi()+
				"\n Soyadı:" + muster.getSoyadi()+
				"\n Adresi:"+ muster.getAdres().getAdres());
		((ConfigurableApplicationContext)cont).close();
	}

}
