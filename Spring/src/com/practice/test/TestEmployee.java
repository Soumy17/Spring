package com.practice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.practice.bean.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		   ApplicationContext  context =new FileSystemXmlApplicationContext("bean.xml");
		   Employee employee = (Employee) context.getBean("empBean");
           System.out.println("ID : " + employee.getID());
           System.out.println("Name : " + employee.getEmployeeName());
           System.out.println("Salary : " + employee.getSalary());
		}

}
