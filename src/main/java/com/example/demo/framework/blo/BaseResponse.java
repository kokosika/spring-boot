package com.example.demo.framework.blo;

import com.example.demo.framework.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public class BaseResponse implements Serializable {

    /**
     * @param response
     * @return
     */
    private ResponseDto responseOk(ResponseDto response) {
        if (response.title == null)
            response.title = "Exito";
        if (response.data == null)
            response.data = "Operacion realizada con exito";
        response.http = HttpStatus.OK;
        return response;
    }

    /**
     * @param response
     * @return
     */
    private ResponseDto responseError(ResponseDto response) {
        if (response.title == null)
            response.title = "Error";
        if (response.data == null)
            response.data = "Hubo un error al realizar la operacion";
        response.http = HttpStatus.BAD_REQUEST;
        return response;
    }

    /**
     * @param response
     * @return
     */
    private ResponseDto responseWarning(ResponseDto response) {
        if (response.title == null)
            response.title = "Advertencia";
        if (response.data == null)
            response.data = "Existen advertencias en la operacion";
        response.http = HttpStatus.CONFLICT;
        return response;
    }

    /**
     * @param title
     * @return
     */
    public ResponseEntity<ResponseDto> ok(String title) {
        ResponseDto response = new ResponseDto();
        response.title = title;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * @param title
     * @param data
     * @return
     */
    public ResponseEntity<ResponseDto> ok(String title, Object data) {
        ResponseDto response = new ResponseDto();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * @param data
     * @return
     */
    public ResponseEntity<ResponseDto> ok(Object data) {
        ResponseDto response = new ResponseDto();
        response.data = data;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * @return
     */
    public ResponseEntity<ResponseDto> ok() {
        ResponseDto response = new ResponseDto();
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * @param title
     * @param data
     * @return
     */
    public ResponseEntity<ResponseDto> error(String title, Object data) {
        ResponseDto response = new ResponseDto();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * @param title
     * @return
     */
    public ResponseEntity<ResponseDto> error(String title) {
        ResponseDto response = new ResponseDto();
        response.title = title;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * @param data
     * @return
     */
    public ResponseEntity<ResponseDto> error(Object data) {
        ResponseDto response = new ResponseDto();
        response.data = data;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * @return
     */
    public ResponseEntity<ResponseDto> error() {
        ResponseDto response = new ResponseDto();
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * @param title
     * @param data
     * @return
     */
    public ResponseEntity<ResponseDto> warning(String title, Object data) {
        ResponseDto response = new ResponseDto();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * @param title
     * @return
     */
    public ResponseEntity<ResponseDto> warning(String title) {
        ResponseDto response = new ResponseDto();
        response.title = title;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * @param data
     * @return
     */
    public ResponseEntity<ResponseDto> warning(Object data) {
        ResponseDto response = new ResponseDto();
        response.data = data;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * @return
     */
    public ResponseEntity<ResponseDto> warning() {
        ResponseDto response = new ResponseDto();
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * @param title
     * @param data
     * @param http
     * @return
     */
    public ResponseEntity<ResponseDto> customResponse(String title, Object data, HttpStatus http) {
        ResponseDto response = new ResponseDto();
        response.title = title;
        response.data = data;
        response.http = http;
        return new ResponseEntity<>(response, response.http);
    }

    /**
     * @param ex
     * @return
     */
    public ResponseEntity<ResponseDto> customException(Exception ex) {
        ResponseDto response = new ResponseDto();
        response.title = "Error inesperado";
        response.data = ex.getMessage();
        response.http = HttpStatus.BAD_REQUEST;
        response.trace = ex.getStackTrace();
        return new ResponseEntity<>(response, response.http);

    }

}
