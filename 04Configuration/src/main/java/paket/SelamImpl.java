package paket;

public class SelamImpl implements ISelam {
	@Override
	public void mesajyaz(String mesaj) {
		System.out.println("*********  "+mesaj );
	}
} 