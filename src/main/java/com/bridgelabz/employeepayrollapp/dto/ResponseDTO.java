package com.bridgelabz.employeepayrollapp.dto;
//POJO CLASS
public class ResponseDTO {
    //PRIVATE VARIABLES
    private String message;
    private Object data;

    //CONSTRUCTOR
    public ResponseDTO(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    //GETTERES AND SETTERS
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
