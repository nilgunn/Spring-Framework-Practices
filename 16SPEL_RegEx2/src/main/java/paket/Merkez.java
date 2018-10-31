package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext(
				"C:\\Users\\NİLGÜN\\eclipse-workspace\\16SPEL_RegEx2\\SpringBeansConfig.xml");

		Listeler list = (Listeler) cont.getBean("beanlisteler");
		System.out.println(list);
		RegEx r = (RegEx) cont.getBean("beanregex");
		System.out.println(r);
		((ConfigurableApplicationContext) cont).close();

	}

}
