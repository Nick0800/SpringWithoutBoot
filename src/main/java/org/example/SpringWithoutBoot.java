package org.example;

import org.example.schooling.School;
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
        stud.age = 10;
        System.out.println(stud.age);
        /*Question: On which line Object is getting created either on line 12 or 16?
        * Ans: In line 12 we are not just creating an IOC container. We are also saying spirng hey we have an applicationcontect.xml file go to it and create all the beans which are specified in it.
        * */


        /*Lets say I'm calling Sping bean using 2 different reference variables in this case will it create 2 objects or one?
        * Ans: It'll create only one bean! Since we are declaring only one in XML file. & we are calling same student bean in 2 places line 17 & 28
        * Proof: I'll define a variable in Student class & set the value for the variable in "stud" if it create 2 different objects it'll give two different output's else one.
        * Why it is happening?
        * Because of the scope. By default Spring will be a Singleton Scope. But what if we need 2 different objects, we'll specify the scope of the bean to prototype in XML file.
        * Scopes:
        *  - singleton (default): one instance per container, shared everywhere. This is what you’ve been using so far.
        * prototype: a new instance each time the bean is requested or injected.
        * request: one instance per HTTP request (web apps only).
        * session: one instance per HTTP session (web apps only).
        * application: one instance per ServletContext (web apps only).
        * websocket: one instance per WebSocket session (web apps only).
        * */

        /*If we specify the scope of the bean to Prototype, bean will not get created while loading an application, it will get created only when we called or injected but Singleton will create at the time of application loaded/IOC container created and used as many times as we need.*/

        Student stud2 = (Student) context.getBean("student");
        System.out.println(stud2.age);

//        Student student = new Student();
//        stud.code();

    }
}
