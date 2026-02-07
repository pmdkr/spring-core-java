package in.scalive.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.scalive.beans.Student;

public class UseStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("/in/scalive/resources/beanconf.xml");

		BeanFactory container = new XmlBeanFactory(res);
		System.out.println("Container started...");
		
		Student s = (Student) container.getBean("stObj");

		System.out.println("Name :" + s.getName());
		System.out.println("Roll no : " + s.getRoll_no());

	}

}
