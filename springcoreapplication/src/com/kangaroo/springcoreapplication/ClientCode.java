package com.kangaroo.springcoreapplication;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientCode {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Object o = factory.getBean("stu");
        Student s = (Student)o;
        System.out.println(s);
    //    System.out.println(s.getRno() + " "+s.getSname());

	}

}
