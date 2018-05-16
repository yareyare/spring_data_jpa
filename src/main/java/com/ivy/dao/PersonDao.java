package com.ivy.dao;

import com.ivy.entity.Person;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * Created by ivy on 2018/5/10.
 */
/*
 * 1.Repository是一个空接口，即是一个标记接口
 * 2.若我们定义的接口继承了Repository，则该接口会被IOC容器识别为一个Repository Bean
 * 注入到IOC容器中，进而可以在该接口中定义满足一定规则的接口
 * 3.实际上也可以通过一个注解@RepositoryDefination 注解来替代Repository接口
 */
//@RepositoryDefinition(domainClass=Person.class,idClass=Integer.class)
public interface PersonDao extends Repository<Person, Integer> {

    // 通过id查找实体
    Person getById(Integer id);

    // 通过id和name查询实体,sql:  select * from jpa_persons where id = ? and name = ?
    Person findByIdAndName(Integer id, String name);

    List<Person> findByAddressId(Integer addressId);


}