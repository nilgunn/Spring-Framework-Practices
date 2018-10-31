package paket;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\03spring\\beans.xml");
		//XmlBeanFactory cont = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		Selam selm = (Selam)cont.getBean("selam");
		selm.goster();
		((ConfigurableApplicationContext)cont).close();
	}
}
