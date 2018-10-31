package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class MetotCagiriSonrasiYapilacaklar  {
	@After("execution(* paket.IPersonelServis.selamver(..))")
	public void ilkGorev(JoinPoint jp) {
		System.out.println("---AspectJ---" + jp.getSignature().getName()+" isimli metottan SONRA çalışan ilkGorev() metodu");
		
	}
}