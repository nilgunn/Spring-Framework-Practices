package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class MetotCagiriSonrasiYapilacaklar  {
	@After("execution(* paket.IPersonelServis.selamver(..))")
	public void sonGorev(JoinPoint jp) {
		System.out.println("\n---AspectJ---" + jp.getSignature().getName()+" isimli metottan SONRA çalışan sonGorev() metodu");
		
	}
}