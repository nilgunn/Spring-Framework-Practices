package paket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import paket.conf.Merkezconfig;

public class Merkez {

	public static void main(String[] args) {
		ApplicationContext cont = new AnnotationConfigApplicationContext(Merkezconfig.class);
		A aa = (A) cont.getBean("beana");
		B bb = (B) cont.getBean("beanb");
		aa.yaz("Selam Dünya 1.");
		bb.yaz("Selam Dünya 2.");
		((ConfigurableApplicationContext)cont).close();
	}
}
