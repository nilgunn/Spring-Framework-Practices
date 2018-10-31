package paket;

public class Adres {
	private String tamadres;

	public String getTamadres() {
		return tamadres;
	}

	public void setTamadres(String tamadres) {
		this.tamadres = tamadres;
	}

	@Override
	public String toString() {
		return "TAM ADRESİ : " + getTamadres().toUpperCase().toString();
	}
	
}
