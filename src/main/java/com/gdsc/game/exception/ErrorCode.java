package com.gdsc.game.exception;

import org.springframework.http.HttpStatus;

public enum ErrorCode {
    INVALID_INPUT_VALUE(HttpStatus.BAD_REQUEST, "400", "잘못된 입력값입니다"),
    INSUFFICIENT_MANA(HttpStatus.BAD_REQUEST, "400", "마나가 부족합니다"),

    JOB_NOT_FOUND(HttpStatus.NOT_FOUND, "404", "존재하지 않는 직업입니다");

    private final HttpStatus status;
    private final String code;
    private final String message;

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}


