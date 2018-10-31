package aop;

import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//@Aspect
public class MetotCagiriOncesiYapilacaklar  {
	
	//@Before("execution(* paket.IPersonelServis.selamver(..))")
	public void ilkGorev(JoinPoint jp) {
		System.out.println("\n--- AOP <aop:before> XML ETİKETİ ---");
		System.out.println("---AspectJ---" + jp.getSignature().getName()+" isimli metottan ÖNCE çalışan ilkGorev() metodu");
		
	}
}
