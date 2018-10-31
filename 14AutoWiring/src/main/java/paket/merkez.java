package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\14AutoWiring\\SpringBeansConfig.xml");
		Calisan mus =(Calisan) cont.getBean("beancalisan");
		System.out.println(mus);
		((ConfigurableApplicationContext)cont).close();
	}

}
