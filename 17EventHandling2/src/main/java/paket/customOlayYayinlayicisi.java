package paket;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class customOlayYayinlayicisi implements ApplicationEventPublisherAware {
	public ApplicationEventPublisher pub;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		pub = applicationEventPublisher;
	}

	public void yayinla() {
		customOlay c = new customOlay(this);
		pub.publishEvent(c);
	}
	
}
