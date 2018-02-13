/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.framework.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author fcortez
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date state;
    @Temporal(TemporalType.DATE)
    private Date createState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getState() {
        return state;
    }

    public void setState(Date state) {
        this.state = state;
    }

    public Date getCreateState() {
        return createState;
    }

    public void setCreateState(Date createState) {
        this.createState = createState;
    }


}
