package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IAccountAccessBlo;
import com.example.demo.blo.interfaces.common.IBuyProductDetailBlo;
import com.example.demo.dao.interfaces.common.IAccounAccessDao;
import com.example.demo.dao.interfaces.common.IBuyProductDetailDao;
import com.example.demo.entity.common.AccountAccess;
import com.example.demo.entity.common.BuyProductDetail;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class BuyProductDetailBlo extends BaseBlo<BuyProductDetail, Integer> implements IBuyProductDetailBlo {

    private final IBuyProductDetailDao buyProductDetailDao;

    /**
     * Inject dao
     *
     * @param buyProductDetailDao base dao
     */
    public BuyProductDetailBlo(IBuyProductDetailDao buyProductDetailDao) {
        super(buyProductDetailDao);
        this.buyProductDetailDao = buyProductDetailDao;
    }
}
