package paket.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Aconfig.class, Bconfig.class})
public class Merkezconfig {

}
