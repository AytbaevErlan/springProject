package org.example.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class DemoAop {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();
        context.scan("org.example.spring.aop");
        context.refresh();

       org.example.spring.aop.User user = (org.example.spring.aop.User) context.getBean("user-aop");

        System.out.println("===== First Method Demo =====");
        System.out.println(user.getFirstName());

        System.out.println("===== Second Method Demo =====");
        user.throwException();
    }
}