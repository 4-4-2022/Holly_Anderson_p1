package com.holly;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component("loggingAspect")
public class LoggingAspect {

	// The below command creates a new logger

	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut("within(com.holly.services.*)")
	public void logWithinServicePackage() {
	}

	@After("logWithinServicePackage()")
	public void logAfterService(JoinPoint jp) {
		logger.info(jp.getSignature().getName() + " was executed.\n");
	}
}
