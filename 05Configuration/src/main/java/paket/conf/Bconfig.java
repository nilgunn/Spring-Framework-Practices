package paket.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import paket.B;
@Configuration
public class Bconfig {
	@Bean(name = "beanb")
	public B yaz(){
		return new B();
	}
}
