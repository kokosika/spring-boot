package com.example.demo.framework.blo;

import com.example.demo.framework.dao.IBaseDao;
import com.example.demo.framework.dto.ResponseDto;
import com.example.demo.framework.entity.BaseDomainEntity;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.Date;

public class BaseDomainBlo<T extends BaseDomainEntity, ID extends Serializable> extends BaseResponse implements IBaseBlo<T,ID>  {

    protected final IBaseDao baseDao;

    /**
     * @param baseDao
     */
    public BaseDomainBlo(IBaseDao baseDao) {
        this.baseDao = baseDao;
    }

    /**
     * @param entity
     * @return
     */
    @Override
    public ResponseEntity<ResponseDto> save(T entity) {
        try {
            System.out.println(entity.getDescription());
            entity.setState(new Date());
            entity.setCreateState(new Date());
            entity.setName(entity.getName().toUpperCase());
            if (entity.getDescription() != null) {
                entity.setDescription(entity.getDescription().toUpperCase());
            }
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
            entity.setName(entity.getName().toUpperCase());
            if ((entity.getDescription() != null) || (entity.getDescription().trim() != "")) {
                entity.setDescription(entity.getDescription().toUpperCase());
            }
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
