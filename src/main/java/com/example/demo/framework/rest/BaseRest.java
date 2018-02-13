package com.example.demo.framework.rest;


import com.example.demo.framework.blo.IBaseBlo;
import com.example.demo.framework.dto.ResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;

public class BaseRest<T, ID extends Serializable> {

    private final IBaseBlo baseBlo;

    /**
     * Inject blo
     *
     * @param baseBlo interfaz blo
     */
    public BaseRest(IBaseBlo baseBlo) {
        this.baseBlo = baseBlo;
    }

    @GetMapping
    public ResponseEntity<ResponseDto> findALl() {
        return this.baseBlo.findAll();
    }

    @GetMapping(value = "/find")
    public ResponseEntity<ResponseDto> findByKey(@RequestParam("id") ID id) {
        return this.baseBlo.findByKey(id);
    }

    @PostMapping
    public ResponseEntity<ResponseDto> save(@RequestBody T entity) {
        return this.baseBlo.save(entity);
    }

    @PutMapping
    public ResponseEntity<ResponseDto> update(@RequestParam Integer id, @RequestBody T entity) {
        return this.baseBlo.update(entity);
    }

    @DeleteMapping
    public ResponseEntity<ResponseDto> update(@RequestParam("id") ID id) {
        return this.baseBlo.delete(id);
    }

}
