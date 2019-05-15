package com.aw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.aw.beans.Cab;
import com.aw.config.AppConfig;

public class AWTest {
	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\aw\\common\\application-context.xml"));
ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfig.class);
		Cab cab=factory.getBean("cab", Cab.class);
	System.out.println(cab);
	}

}
