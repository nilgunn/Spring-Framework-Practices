package paket;

public class ucgen{
	private String çeşit;
	public ucgen(String para) {
		çeşit = para;
	}
	
	public String getÇeşit() {
		return çeşit;
	}

	public void setÇeşit(String çeşit) {
		this.çeşit = çeşit;
	}

	public void ciz() {
		System.out.println(getÇeşit()+"Üçgen çiz.");
	}
}
