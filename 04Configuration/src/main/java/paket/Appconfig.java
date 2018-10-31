package paket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	@Bean(name="selam")
	public ISelam mesajyaz() {
		return new SelamImpl();
	}

}
