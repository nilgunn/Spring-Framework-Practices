package paket;

public class Selam {
	private String mesaj;

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}
	public void goster() {
		System.out.println(mesaj);
	}
	public void init() {
		System.out.println("Bean başlatılıyor...");
	}
	public void destroy() {
		System.out.println("Bean sonlandırılıyor...");
	}
}
