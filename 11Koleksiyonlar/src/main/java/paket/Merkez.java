package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\11Koleksiyonlar\\SpringBeansConfig.xml");
		Ogrenci ogr =(Ogrenci) cont.getBean("beanogrenci");
		ogr.getOgrencilist();
		ogr.getOgrenciset();
		ogr.getOgrencimap();
		ogr.getOgrenciprop();
		((ConfigurableApplicationContext)cont).close();
	}

}
