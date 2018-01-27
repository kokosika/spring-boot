package com.example.demo.framework.blo;

import com.example.demo.framework.dao.IBaseDao;
import com.example.demo.framework.dto.ResponseDto;
import com.example.demo.framework.entity.BaseEntity;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.Date;

public class BaseBlo <T extends BaseEntity,ID extends Serializable> extends BaseResponse implements IBaseBlo<T,ID> {

    protected final IBaseDao baseDao;

    /**
     * Inject dao
     * @param baseDao base dao
     */
    public BaseBlo(IBaseDao baseDao) {
        this.baseDao = baseDao;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public ResponseEntity<ResponseDto> save(T entity) {
        try {
            entity.setState(new Date());
            entity.setCreateState(new Date());
            this.baseDao.save(entity);
        } catch (Exception ex) {
            return customException(ex);
        }
        return ok("Exito", "El registro se a insertado con exito");
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public ResponseEntity<ResponseDto> update(T entity) {
        try {
            entity.setState(new Date());
            this.baseDao.update(entity);
        } catch (Exception ex) {
            return customException(ex);
        }
        return ok("Exito", "El registro se a editado con exito");
    }

    /**
     * @param id
     * @return
     */
    @Override
    public ResponseEntity<ResponseDto> delete(ID id) {
        try {
            this.baseDao.delete(id);
        } catch (Exception ex) {
            return customException(ex);
        }
        return ok("Exito", "El registro se a eliminado con exito");
    }

    /**
     * @param id
     * @return
     */
    @Override
    public ResponseEntity<ResponseDto> findByKey(ID id) {
        try {
            return ok(this.baseDao.findByKey(id));
        } catch (Exception ex) {
            return customException(ex);
        }

    }

    /**
     * @return
     */
    @Override
    public ResponseEntity<ResponseDto> findAll() {
        try {
            return ok(this.baseDao.findAll());
        } catch (Exception ex) {
            return customException(ex);
        }
    }

}
