package com.example.demo.base;

import lombok.Getter;

@Getter
public class BizException extends RuntimeException {

    private final int code;  // 错误码

    public BizException(String message) {
        super(message);
        this.code = 500;  // 默认业务异常都是400
    }

    public BizException(int code, String message) {
        super(message);
        this.code = code;
    }

}
