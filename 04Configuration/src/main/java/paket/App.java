package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
	public static void main(String[]args) {
		ApplicationContext cont = new AnnotationConfigApplicationContext(Appconfig.class);
		ISelam obj = (ISelam) cont.getBean("selam");
		obj.mesajyaz("Selam Dünya");
		((ConfigurableApplicationContext)cont).close();
	
	}
}
