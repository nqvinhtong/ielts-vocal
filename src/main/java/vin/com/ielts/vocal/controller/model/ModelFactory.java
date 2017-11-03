package vin.com.ielts.vocal.controller.model;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ModelFactory {

	public ModelFactory() {}

    public ResponseEntity success() {
        GeneralResponse<Object> responseObject = new GeneralResponse();
        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setCode(ResponseConstants.SUCCESS_CODE);
        responseStatus.setMessage(ResponseConstants.SUCCESS_MESSAGE);
        responseObject.setStatus(responseStatus);
        return ResponseEntity.ok(responseObject);
    }

    public ResponseEntity success(Object data, Class clazz) {
        GeneralResponse<Object> responseObject = new GeneralResponse();
        ResponseStatus responseStatus = new ResponseStatus();
        responseStatus.setCode(ResponseConstants.SUCCESS_CODE);
        responseStatus.setMessage(ResponseConstants.SUCCESS_MESSAGE);
        responseObject.setStatus(responseStatus);
        responseObject.setData(clazz.cast(data));
        return ResponseEntity.ok(responseObject);
    }

    public ResponseEntity error(HttpStatus httpStatus, String errorCode, String errorMessage) {
        ResponseStatus responseStatus = new ResponseStatus();
        GeneralResponse<Object> responseObject = new GeneralResponse<>();
        responseStatus.setCode(errorCode);
        responseStatus.setMessage(errorMessage);
        responseObject.setStatus(responseStatus);
        return new ResponseEntity(responseObject, httpStatus);
    }

}
