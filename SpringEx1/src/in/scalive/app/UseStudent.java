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

		Student s1 = (Student) container.getBean("stObj1");
		Student s2 = (Student) container.getBean("stObj2");

		System.out.println("Name :" + s1.getName());
		System.out.println("Roll no : " + s1.getRoll_no());
		System.out.println("Name :" + s2.getName());
		System.out.println("Roll no : " + s2.getRoll_no());

	}

}
