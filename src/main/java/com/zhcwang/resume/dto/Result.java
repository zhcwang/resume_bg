package com.zhcwang.resume.dto;

public class Result {

    private String state;

    private Object data;

    private String errorMessage;

    private Result(String state, Object data) {
        this.state = state;
        this.data = data;
    }

    private Result(String state, String errorMessage) {
        this.state = state;
        this.errorMessage = errorMessage;
    }

    public static Result getSuccessResult(Object data){
        return new Result("success", data);
    }

    public static Result getFailResule(String errorMessage){
        return new Result("fail", errorMessage);
    }
}
