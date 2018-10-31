package paket;

public interface IPersonelServis {
	
	public String getAdi();
	public void setAdi(String adi);
	public String getSoyadi();
	public void setSoyadi(String soyadi);
	public int getTecrube();
	public void setTecrube(int tecrube) ;
	
	public void adisoyadikontrolet();
	public void selamver(String mesaj);
	public void personelbilgisiniver();
	
}
