package com.ebubekir.springmvcboot;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.ebubekir.springmvcboot.AlienController.getAliens())")
	public void logBefore() {
		LOGGER.info("getAliens method called from aspect");
	}
	
	//Works when we get any result
//	@After("execution(public * com.ebubekir.springmvcboot.AlienController.getAliens())")
//	public void logAfterFinally() {
//		LOGGER.info("getAliens method executed");
//	}	
	
	//Works when we get a successful execution
	@AfterReturning("execution(public * com.ebubekir.springmvcboot.AlienController.getAliens())")
	public void logAfterReturning() {
		LOGGER.info("getAliens method executed");
	}
	
	//Works when we get any exception
	@AfterThrowing("execution(public * com.ebubekir.springmvcboot.AlienController.getAliens())")
	public void logException() {
		LOGGER.info("issue");
	}

}
