package paket;

import org.springframework.context.ApplicationListener;

public class customOlayIsleyicisi implements ApplicationListener<customOlay>{

	@Override
	public void onApplicationEvent(customOlay event) {

		System.out.println(event.toString());
		
	}
	
	
}
