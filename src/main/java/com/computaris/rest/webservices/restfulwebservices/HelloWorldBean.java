package com.computaris.rest.webservices.restfulwebservices;

/**
 * project: restful-web-services
 * class: HelloWorldBean
 * created by: rci
 * on 19/10/2020
 */
public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
