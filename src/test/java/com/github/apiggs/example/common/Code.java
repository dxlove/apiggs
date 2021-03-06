package com.github.apiggs.example.common;

/**
 * @responseCode
 */
public enum Code{

    OK(0,"ok"),
    ERROR(-1,"error"),
    NoAuth(1,"no auth");

    private int code;
    private String text;

    Code(int code, String text) {
        this.code = code;
        this.text = text;
    }
}