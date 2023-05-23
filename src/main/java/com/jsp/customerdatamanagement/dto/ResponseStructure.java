package com.jsp.customerdatamanagement.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponseStructure<T> {    //for adding status code and messages to response Object
	
	private Integer statusCode;
	
	private T data;
	
	private String message;
	
	private LocalDateTime timeStatp;
	

}
