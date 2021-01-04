package com.ebubekir.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//    	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml")); Old method to use beanFactory
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Alien obj1 = (Alien) factory.getBean("alien");
		obj1.code();
		
		System.out.println(obj1.getAge());

		}
}
