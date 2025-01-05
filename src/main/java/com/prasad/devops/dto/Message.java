package com.prasad.devops.dto;

public class Message
{
    private Integer status;
    private String message ;

    public Message()
    {
    }

    public Message(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
