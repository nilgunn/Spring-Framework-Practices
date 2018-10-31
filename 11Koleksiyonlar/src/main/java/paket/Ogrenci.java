package paket;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Ogrenci {
	List <?> ogrencilist;
	Set <?> ogrenciset;
	Map <?,?> ogrencimap;
	Properties ogrenciprop;
	public List<?> getOgrencilist() {
		System.out.println("List elemanları     : " + ogrencilist);
		return ogrencilist;
	}
	public void setOgrencilist(List<?> ogrencilist) {
		this.ogrencilist = ogrencilist;
	}
	public Set<?> getOgrenciset() {
		System.out.println("Set elemanları      : " + ogrenciset);
		return ogrenciset;
	}
	public void setOgrenciset(Set<?> ogrenciset) {
		this.ogrenciset = ogrenciset;
	}
	public Map<?, ?> getOgrencimap() {
		System.out.println("Map elemanları      : " + ogrencimap);
		return ogrencimap;
	}
	public void setOgrencimap(Map<?, ?> ogrencimap) {
		this.ogrencimap = ogrencimap;
	}
	public Properties getOgrenciprop() {
		System.out.println("Property elemanları : " + ogrenciprop);
		return ogrenciprop;
	}
	public void setOgrenciprop(Properties ogrenciprop) {
		this.ogrenciprop = ogrenciprop;
	}
}
