package vin.com.ielts.vocal.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseStatus {

    public static String SUCCESS_CODE = "success";
    public static String SUCCESS_MESSAGE = "Success";
    public static String GENERAL_ERROR = "error";

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResponseStatus{");
        sb.append("code='").append(code).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
