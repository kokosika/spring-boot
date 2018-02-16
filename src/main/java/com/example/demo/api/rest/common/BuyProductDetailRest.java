package com.example.demo.api.rest.common;


import com.example.demo.blo.interfaces.common.IBuyProductDetailBlo;
import com.example.demo.entity.common.BuyProductDetail;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/buy-product-detail")
public class BuyProductDetailRest extends BaseRest<BuyProductDetail, Integer> {

    private final IBuyProductDetailBlo buyProductDetailBlo;

    /**
     * Inject blo
     *
     * @param buyProductDetailBlo interfaz blo
     */
    public BuyProductDetailRest(IBuyProductDetailBlo buyProductDetailBlo) {
        super(buyProductDetailBlo);
        this.buyProductDetailBlo = buyProductDetailBlo;
    }
}
