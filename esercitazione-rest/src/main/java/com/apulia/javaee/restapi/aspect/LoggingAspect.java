package com.apulia.javaee.restapi.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class LoggingAspect {

	private final static Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

	@Around("execution(* com.apulia.javaee.restapi..*(..)))")
	public Object logMethodExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();

		final StopWatch stopWatch = new StopWatch();

		// calculate method execution time
		stopWatch.start();
		Object result = proceedingJoinPoint.proceed();
		stopWatch.stop();

		// Log method execution time
		LOGGER.info("Spring Boot Logging AOP EXAMPLE - Execution time of "
				+ methodSignature.getDeclaringType().getSimpleName() // Class Name
				+ "." + methodSignature.getName() + " " // Method Name
				+ ":: " + stopWatch.getTotalTimeMillis() + " ms");

		return result;
	}
}
