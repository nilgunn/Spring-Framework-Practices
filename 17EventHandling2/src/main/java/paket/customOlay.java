package paket;

import org.springframework.context.ApplicationEvent;

public class customOlay extends ApplicationEvent {

	public customOlay(Object source) {
		super(source);
	}
	private static final long serial = 1L;

	@Override
	public String toString() {
		return "Custom Event (Özelleştirilmiş Olay)";
	}

}
