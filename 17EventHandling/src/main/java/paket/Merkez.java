package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		// ConfigurableApplicationContext context = new
		// FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\17EventHandling\\src\\main\\resources\\17SpringBeansConfig.xml");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("17SpringBeansConfig.xml");

		context.start();
		Sozler soz = context.getBean("beansozler", Sozler.class);
		soz.ekranayaz();
		context.stop();
		context.close();
	}

}
