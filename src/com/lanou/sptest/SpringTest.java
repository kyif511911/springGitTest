package com.lanou.sptest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lanou.bean.Person;

public class SpringTest {
	
	@Test
	public void myTest(){
		
		//��²²�
		//�Һٺٺ�
		
		System.out.println("��ʲô��");
		
		
		
		
		// 1.不使用spring下的对象创建
//		Car car = new Car();
//		car.setName("小黄");
//		car.setNum(2222);
//		car.setBrand("宝马");
//		
//		System.out.println(car);
		
		
		// 读取appContext配置文件中的信息
		ApplicationContext aContext = new ClassPathXmlApplicationContext("appContext.xml");
				
		
//		Car car = (Car) aContext.getBean("car5");
		
//		System.out.println(car);
		
		Person person = (Person) aContext.getBean("person");
		
		System.out.println(person);
		
		
	}

}







