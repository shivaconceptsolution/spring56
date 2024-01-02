package com.kangaroo.springcoreapplication;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SICode {

	public static void main(String[] args) {
	//	Resource res = new ClassPathResource("siContext.xml");
//		BeanFactory obj = new XmlBeanFactory(res);
		
		ApplicationContext obj = new ClassPathXmlApplicationContext("siContext.xml");
		Object o = obj.getBean("si");
		SI s = (SI)o;
		System.out.println((s.getP()*s.getR()*s.getT())/100);
		

	}

}
