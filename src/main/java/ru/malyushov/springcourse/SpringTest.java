package ru.malyushov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appllicationContext.xml");

        TestBean testBean = context.getBean("testBean", TestBean.class);

        System.out.println(testBean.getName());

    }
}
