package com.test.spring.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {
@After("args(name)")
public voud logStringArguments(String name) {
	System.out.println("Running after Advice String argument passed");
	
}
@AfterThrowing("within(com.test.model.Employee)")
public void logException(Joinpoint joinpoint) {
	System.out.println("Exception thrown in employee method:"+joinpoint.toString());
}
@AfterReturning(pointcut="execution,")
}
