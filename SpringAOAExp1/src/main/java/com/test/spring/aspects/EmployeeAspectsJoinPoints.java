package com.test.spring.aspects;

import org.aopalliance.intercept.Joinpoint;

@Aspect
public class EmployeeAspectsJoinPoints {
public void logginAdvice(Joinpoint joinpoint) {
	System.out.println("before executing loggin advice on method");
}
public void getNamePointCut() {
	
}
@public void allMethodAdvice() {
	System.out.println("before executing service method");
}
}
