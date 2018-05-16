package com.ivy.test;

import com.ivy.dao.PersonDao;
import com.ivy.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ivy on 2018/5/13.
 */
public class TestQuickStart {

    private static ApplicationContext ctx;

    static {
        ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml") ;
    }

    @Test
    public void getById(){
        PersonDao bean = ctx.getBean(PersonDao.class);
        Person person = bean.getById(1);

        Person personaa = bean.findByIdAndName(1,"aa");


        System.out.println(person.getName());
        System.out.println(personaa.getName());

        List<Person> byAddressId = bean.findByAddressId(1);
        for (Person p: byAddressId){
            System.out.println("p "+p.getName());
        }

    }
}
