package paket;

public class C {
	public C () {
		System.out.println("C sınıfının parametresiz hazırlayıcı metoodu.");
	}
	public C(A anesne, B bnesne) {
		System.out.println("C sınıfının A ve B tipinde iki parametreli hazırlayıcı metoodu.");
		anesne.yaz();
		bnesne.yaz();
	}
	public C(String mesaj, int sayı) {
		System.out.println("C sınıfının String ve int tipinde iki parametreli hazırlayıcı metoodu.\n"
				+ mesaj +" - "+ sayı);
	}
}
