package paket;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Ogrenci {
	
	String adi, soyadi, bolumu;
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getBolumu() {
		return bolumu;
	}
	public void setBolumu(String bolumu) {
		this.bolumu = bolumu;
	}
	public int getYasi() {
		return yasi;
	}
	public void setYasi(int yasi) {
		this.yasi = yasi;
	}
	int yasi;
}
