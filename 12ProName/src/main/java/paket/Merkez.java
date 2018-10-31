package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\12ProName\\src\\main\\java\\paket\\SpringBeansConfig.xml");
		Ogrenci ogr =(Ogrenci) cont.getBean("beanogrenci");
		System.out.println("ADI      :" + ogr.getAdi());
		System.out.println("SOYADI   :" + ogr.getSoyadı());
		System.out.println("NUMARASI :" + ogr.getNumarasi());
		System.out.println("ÜNİVERSİTESİ :" + ogr.getÜniversite().getOkuladi());
		((ConfigurableApplicationContext)cont).close();
	}

}
