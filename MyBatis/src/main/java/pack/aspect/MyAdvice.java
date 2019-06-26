package pack.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAdvice {
	@Around("execution(public * pack.business..*(..))")
	public Object kor(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("시작");
		Object object= joinPoint.proceed();
		System.out.println("종료");
		return object;
	}
}
