package com.aw.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.aw.beans.Cab;

public class AWTest {
	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("com\\aw\\common\\application-context.xml"));
	Cab cab=factory.getBean("cab", Cab.class);
	System.out.println(cab);
	}

}
