package aop;

import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;

//@Aspect
public class MetodunGeriDonusDegeriSonrasiYapilacaklar {
	
	//@AfterReturning(pointcut = "execution(* paket.IPersonelServis.selamver(..))", returning = "sonuc")
	
	public void geriDonusSonrasiGorev(JoinPoint jp, Object sonuc) {
		System.out.println("\n--- AOP <aop:after-returning> XML ETİKETİ ---");
		System.out.println("---AspectJ---" + jp.getSignature().getName()+" metodun GERİ DÖNÜŞ DEĞERİNDEN SONRA çalışan metot");
		System.out.println(jp.getSignature().getName()+" metodunun GERİ DÖNÜŞ DEĞERİ : "+ sonuc);
	}
}
