package com.vivek.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
//Spring core Annotation
public class App 
{
    public static void main(String[] args) {
    	ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class );  	
		Samsung s7=factory.getBean(Samsung.class);
		s7.config();
	}
}
