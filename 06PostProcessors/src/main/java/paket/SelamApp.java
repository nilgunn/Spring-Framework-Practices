package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
@SuppressWarnings("deprecation")
public class SelamApp {

	public static void main(String[] args) {
		ApplicationContext cont = new FileSystemXmlApplicationContext("C:\\Users\\NİLGÜN\\eclipse-workspace\\06PostProcessors\\beans.xml");
		Selam slm = (Selam) cont.getBean("selam");
		slm.setMesaj("Set ile yazılan mesaj");
		slm.goster();
		((AbstractApplicationContext) cont).registerShutdownHook();
		((ConfigurableApplicationContext)cont).close();
	}

}
