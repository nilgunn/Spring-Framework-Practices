package paket.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import paket.A;
@Configuration
public class Aconfig {
	@Bean(name = "beana")
	public A yaz(){
		return new A();
	}
}
