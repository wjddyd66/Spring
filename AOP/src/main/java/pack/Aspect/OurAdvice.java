package pack.Aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OurAdvice {
	@Around("execution(public * pack.BL..*(..))")
	public Object kbs(ProceedingJoinPoint joinPoint1) throws Throwable {

		System.out.println("Hello CheckPoint1");
		Object object = joinPoint1.proceed();
		System.out.println("Hello CheckPoint2");
		return object;
	}
}
