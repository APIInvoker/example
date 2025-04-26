package com.example.demo.base;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResp<T> {
    private int code;
    private String msg;
    private T data;
}
