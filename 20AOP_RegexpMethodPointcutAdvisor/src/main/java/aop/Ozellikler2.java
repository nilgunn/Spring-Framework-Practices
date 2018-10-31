package aop;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Ozellikler2 implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation minv) throws Throwable {
		System.out.println("-----Çağrılan metodun ÖNCEKİ durumu.");
		System.out.println("-----Çağrılan metodun adı: "+ minv.getMethod().getName());
		System.out.println("-----Çağrılan metodun argumentleri : " + Arrays.toString(minv.getArguments()));
		try {
			Object result = minv.proceed();
			System.out.println("-----Çağrılan metodun SONRAKİ durumu.");
			return result;
		}catch(IllegalArgumentException e){
			System.out.println("-----Çağrılan metoda istisna meydana gelme durumu.");
			throw e;
		}	
	}
}
