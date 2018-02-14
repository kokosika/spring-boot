package com.example.demo.blo.blo.common;

import com.example.demo.blo.interfaces.common.IAccountAccessBlo;
import com.example.demo.blo.interfaces.common.IBuyProductBlo;
import com.example.demo.dao.interfaces.common.IAccounAccessDao;
import com.example.demo.dao.interfaces.common.IBuyProductDao;
import com.example.demo.entity.common.AccountAccess;
import com.example.demo.entity.common.BuyProduct;
import com.example.demo.framework.blo.BaseBlo;
import org.springframework.stereotype.Service;

@Service
public class BuyProductBlo extends BaseBlo<BuyProduct, Integer> implements IBuyProductBlo {

    private final IBuyProductDao buyProductDao;

    /**
     * Inject dao
     *
     * @param buyProductDao base dao
     */
    public BuyProductBlo(IBuyProductDao buyProductDao) {
        super(buyProductDao);
        this.buyProductDao = buyProductDao;
    }
}
