package paket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanyazar")
public class Yazar {
	@Value("Can")
	private String adi;
	@Value("Solmaz")
	String soyadi;
	@Value("#{beankitap}")
	String kitapadi;
	@Value("#{beankitap.eseradi}")
	private Kitap kitap;
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
	public String getKitapadi() {
		return kitapadi;
	}
	public void setKitapadi(String kitapadi) {
		this.kitapadi = kitapadi;
	}
	public Kitap getKitap() {
		return kitap;
	}
	public void setKitap(Kitap kitap) {
		this.kitap = kitap;
	}
}
