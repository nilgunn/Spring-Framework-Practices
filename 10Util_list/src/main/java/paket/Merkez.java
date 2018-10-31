package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\10Util_list\\SpringBeansConfig.xml");
		Personel per =(Personel) cont.getBean("beanpersonel");
		System.out.println(per);
		((ConfigurableApplicationContext)cont).close();
	}

}
