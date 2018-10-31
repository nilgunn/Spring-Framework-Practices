package aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MetotCagiriSonrasiYapilacaklar implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("\n---Spring AOP ile her metottan SONRA devreye giren afterReturning metodu.---");
	}
}
