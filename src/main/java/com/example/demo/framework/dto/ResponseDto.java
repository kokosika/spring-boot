package com.example.demo.framework.dto;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class ResponseDto implements Serializable {

    public String title;
    public Object data;
    public HttpStatus http;
    public Object trace;

}
