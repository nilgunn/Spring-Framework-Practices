package paket;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beankitap")
public class Kitap {
	@Value("786786996457")
	private long eserISBN;
	@Value("Java Porgramming")
	private String eseradi;
	
	public long getEserISBN() {
		return eserISBN;
	}
	public void setEserISBN(long eserISBN) {
		this.eserISBN = eserISBN;
	}
	public String getEseradi() {
		return eseradi;
	}
	public void setEseradi(String eseradi) {
		this.eseradi = eseradi;
	}
}
