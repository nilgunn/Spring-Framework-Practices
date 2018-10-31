package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\10Util_Properties\\src\\main\\resources\\SpringBeansConfig.xml");
		Ayar ayar =(Ayar) cont.getBean("beanayar");
		System.out.println(ayar);
		ayar.sonucuYaz();
		((ConfigurableApplicationContext)cont).close();
	}
}
