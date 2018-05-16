package com.ivy.test;

import com.ivy.dao.PersonDao;
import com.ivy.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by ivy on 2018/5/13.
 */
public class TestFindByAddressId {

    private static ApplicationContext ctx;

    static {
        ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml") ;
    }

    public static void main(String[] args) {
        PersonDao bean = ctx.getBean(PersonDao.class);
        List<Person> byAddressId = bean.findByAddressId(1);
        for (Person p: byAddressId){
            System.out.println("p "+p.getName());
        }
    }

}
