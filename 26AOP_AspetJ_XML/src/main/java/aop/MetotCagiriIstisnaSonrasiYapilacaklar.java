package aop;

import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;

//@Aspect
public class MetotCagiriIstisnaSonrasiYapilacaklar {
//@AfterThrowing(pointcut = "execution(* paket.IPersonelServis.adisoyadikontrolet(..))", throwing = "hata")

public void istisnadanSonrakiGorev(JoinPoint jp, Throwable hata) {
	
	System.out.println("\n--- AOP <aop:after-throwing> XML ETİKETİ ---");
	System.out.println("---AspectJ---" + jp.getSignature().getName()+" metodun bir İSTİSNADAN SONRA çalışan metot");
	System.out.println(jp.getSignature().getName()+" metodunda meydana gelen istisna türü : "+ hata + "\n");
}
}
