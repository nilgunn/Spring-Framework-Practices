package aop;


import org.springframework.aop.ThrowsAdvice;

public class MetotCagiriIstisnaSonrasiYapilacaklar implements ThrowsAdvice{
	//@Override
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("\n---Spring AOP ile metotlardaki bir İSTİSNADAN SONRA devreye giren afterThrowing metodu.---");
	}
}
