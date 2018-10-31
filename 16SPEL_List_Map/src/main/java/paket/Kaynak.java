package paket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kaynak {

	private Map<String, String> mapimiz;
	private List<String> listemiz;

	public Kaynak() {
		mapimiz = new HashMap<String, String>();
		mapimiz.put("Python", "Yaren Koç");
		mapimiz.put("Java", "Oya Başar");
		mapimiz.put("C++", "Arzu Kılıç");

		listemiz = new ArrayList<String>();
		listemiz.add("Melih Kale");
		listemiz.add("Hüseyin Can");
		listemiz.add("Ozan Aydın");
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
