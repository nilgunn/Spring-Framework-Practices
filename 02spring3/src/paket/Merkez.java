package paket;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class Merkez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanf = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//ApplicationContext beanf = new ClassPathXmlApplicationContext("spring.xml");
		Araba arb = (Araba)beanf.getBean("araba");
		arb.hareketegec();
		//((ConfigurableApplicationContext)beanf).close();
		}

}
