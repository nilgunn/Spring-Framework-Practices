package paket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kaynak {

	private Map<String, String> mapimiz;
	private List<String> listemiz;
	private String eposta;

	public Kaynak() {
		eposta = "java@yandex.ru";
		mapimiz = new HashMap<String, String>();
		mapimiz.put("Melih Kale", "melihkale@gmail.com");
		mapimiz.put("Hüseyin Can", "hcan@gmail.com");
		mapimiz.put("Ozan Aydın", "ozanaydin@gmail.com");

		listemiz = new ArrayList<String>();
		listemiz.add("Melih Kale");
		listemiz.add("Hüseyin Can");
		listemiz.add("Ozan Aydın");
	}
	
	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}

	public Map<String, String> getMapimiz() {
		return mapimiz;
	}

	public void setMapimiz(Map<String, String> mapimiz) {
		this.mapimiz = mapimiz;
	}

	public List<?> getListemiz() {
		return listemiz;
	}

	public void setListemiz(List<String> listemiz) {
		this.listemiz = listemiz;
	}
}

