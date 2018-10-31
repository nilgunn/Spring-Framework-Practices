package paket;
import org.springframework.beans.factory.BeanFactory;
//import javax.annotation.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
public class cizim {
	public static void main(String[] args) {
		//BeanFactory beanf = new XmlBeanFactory(new FileSystemResource("ucgen.xml"));
		//ApplicationContext nesne = new ClassPathXmlApplicationContext("New3.xml");
		//Resource res = (Resource) new FileSystemResource("ucgen.xml");
		//BeanFactory nesne = context;
		XmlBeanFactory nesne= new XmlBeanFactory(new FileSystemResource("New3.xml"));
		ucgen ucg = (ucgen)nesne.getBean("ucgen");
		ucg.ciz();
		//((ConfigurableApplicationContext)nesne).close();
	}
}