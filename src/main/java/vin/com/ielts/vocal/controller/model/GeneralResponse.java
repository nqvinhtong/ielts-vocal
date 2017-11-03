package vin.com.ielts.vocal.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GeneralResponse<T> implements Serializable {

    @JsonProperty("status")
    private ResponseStatus status;

    @JsonProperty("data")
    private T data;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeneralResponse{");
        sb.append("status=").append(status);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }
}
