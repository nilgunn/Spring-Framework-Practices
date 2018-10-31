package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\08constructorDI\\src\\main\\java\\SpringBeansConfig.xml");
		B nes = (B) cont.getBean("beanb");
		System.out.println("B oluştu.");
		nes.yaz();
		System.out.println("B yazdı.");
		C nesc = (C) cont.getBean("beanc");
		System.out.println("C oluştu.");
		((AbstractApplicationContext) cont).registerShutdownHook();
		((ConfigurableApplicationContext)cont).close();

	}

}
