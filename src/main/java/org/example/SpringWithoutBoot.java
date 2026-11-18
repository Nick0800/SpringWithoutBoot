package org.example;

import org.example.schooling.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SpringWithoutBoot {
    static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

        // Since we are using classpath XML context so in line 15 we are asking container to give me the bean student. But we didn't asked  Spring to create one. In Xml based configuration we'll tell to create bean in xml file in the class Path.
        // If you see line 12 we are saying Class Path XML means it'll look for the xml file in class path of the application which is in org.example. I've created an gave the file name in line 12.
        Student stud = (Student) context.getBean("student");

//        Student student = new Student();
        stud.code();


    }
}
