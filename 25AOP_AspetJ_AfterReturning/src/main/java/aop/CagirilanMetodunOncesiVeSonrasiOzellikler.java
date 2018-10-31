package aop;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CagirilanMetodunOncesiVeSonrasiOzellikler {
@Around("execution(* paket.IPersonelServis.adisoyadikontrolet(..))")
	
	public void secilenMetoduSar(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("\n### AspectJ ###" + jp.getSignature().getName()+" metodundan ÖNCEKİ çalışan metot");
		System.out.println("\n### AspectJ ###" + " çağırılan metodun argumentleri : " + Arrays.toString(jp.getArgs()));
		jp.proceed();
		System.out.println("\n### AspectJ ###" + jp.getSignature().getName()+" metodundan SONRAKİ çalışan metot");
		
		}
}
