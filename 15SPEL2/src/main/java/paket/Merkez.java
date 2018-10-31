package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\15SPEL\\SpringBeansConfig.xml");
		
		Yazar yaz =(Yazar) cont.getBean("beanyazar");
		System.out.println("YAZAR : " + yaz.getAdi() + " "+ yaz.getSoyadi()+ "\n"+ yaz.getKitapadi()+ "\n"+
		yaz.getKitap().getEserISBN()+ "\n");	
		
		((ConfigurableApplicationContext)cont).close();
	}
}