package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\11Koleksiyonlar2\\SpringBeansConfig.xml");
		Koleksiyonlar ogr =(Koleksiyonlar) cont.getBean("beankoleksiyonlar");
		System.out.println(ogr);
		((ConfigurableApplicationContext)cont).close();
	}

}
