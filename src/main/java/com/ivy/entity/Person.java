package com.ivy.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by ivy on 2018/5/10.
 */
@Entity
@Table(name="jpa_persons")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private Date birth;

    @ManyToOne
    @JoinColumn
    private Address address;

    /** setter and getter method */
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
