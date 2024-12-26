package com.gdsc.game.dto;

import com.gdsc.game.exception.ErrorCode;

public class ErrorResponse {
    private final String code;
    private final String message;
    private final String status;
    private final String detail;

    private ErrorResponse(String code, String message, String status, String detail) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.detail = detail;
    }

    public static ErrorResponse of(ErrorCode errorCode, String detail) {
        return new ErrorResponse(
                errorCode.getCode(),
                errorCode.getMessage(),
                errorCode.getStatus().toString(),
                detail
        );
    }

    public String getCode() { return code; }
    public String getMessage() { return message; }
    public String getStatus() { return status; }
}
