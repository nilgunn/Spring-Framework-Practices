package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {
	
	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\13InnerBeans\\SpringBeansConfig.xml");
		Musteri mus =(Musteri) cont.getBean("beanmusteri");
		mus.hesabiode();
		((ConfigurableApplicationContext)cont).close();

	}

}
