package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
@SuppressWarnings({"unchecked", "deprecation"})

public class Merkez {
	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\12ConsName\\SpringBeansCon.xml");
		Calisan a =(Calisan) cont.getBean("beancalisan");
		System.out.println("ADI      :" + a.getAdi());
		System.out.println("SOYADI   :" + a.getSoyadi());
		System.out.println("YAŞI     :" + a.getYasi());
		System.out.println("ŞEHİR    :" + a.getAdres().getSehir());
		System.out.println("SEMT     :" + a.getAdres().getSemt());
		System.out.println("MAHALLE  :" + a.getAdres().getMahalle());
		System.out.println("CADDE    :" + a.getAdres().getCadde());
		System.out.println("NO       :" + a.getAdres().getNo());
		System.out.println("DAİRE    :" + a.getAdres().getDaire());
		((ConfigurableApplicationContext)cont).close();
	}
}
