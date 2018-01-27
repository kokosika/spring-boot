package com.example.demo.framework.blo;

import com.example.demo.framework.dto.ResponseDto;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

public interface IBaseBlo <T,ID extends Serializable> {
    /**
     * @param entity
     * @return
     */
    ResponseEntity<ResponseDto> save(T entity);

    /**
     * @param entity
     * @return
     */
    ResponseEntity<ResponseDto> update(T entity);

    /**
     * @param id
     * @return
     */
    ResponseEntity<ResponseDto> delete(ID id);

    /**
     * @param id
     * @return
     */
    ResponseEntity<ResponseDto> findByKey(ID id) ;

    /**
     * @return
     */
    ResponseEntity<ResponseDto> findAll() ;
}
