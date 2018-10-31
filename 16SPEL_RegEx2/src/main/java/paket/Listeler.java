package paket;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("beanlisteler")
public class Listeler {
	
	@Value("#{beankaynak.mapimiz['Melih Kale']}")
	private String mapelemanı;
	@Value("#{beankaynak.listemiz[1]}")
	private String listelemanı;
	public String getMapelemanı() {
		return mapelemanı;
	}
	public void setMapelemanı(String mapelemanı) {
		this.mapelemanı = mapelemanı;
	}
	public String getListelemanı() {
		return listelemanı;
	}
	public void setListelemanı(String listelemanı) {
		this.listelemanı = listelemanı;
	}
	@Override
	public String toString() {
		return " Seçilen map elemanı=" + mapelemanı + "\n Seçilen list elemanı=" + listelemanı;
	}
	
	
}
