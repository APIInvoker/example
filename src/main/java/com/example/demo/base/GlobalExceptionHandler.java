package com.example.demo.base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResp<Object>> handleException(Exception e) {
        ApiResp<Object> resp = new ApiResp<>(500, "服务器异常：" + e.getMessage(), null);
        return ResponseEntity.status(500).body(resp);
    }

}
