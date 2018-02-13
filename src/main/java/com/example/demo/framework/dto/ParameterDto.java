package com.example.demo.framework.dto;

import java.io.Serializable;

public class ParameterDto implements Serializable {

    private String name;
    private Object data;

    public ParameterDto() {
    }

    public ParameterDto(String name, Object data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
