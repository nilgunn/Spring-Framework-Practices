package paket;

import java.util.List;
import java.util.Map;

public class Listeler {

	private String mapelemanı;
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
