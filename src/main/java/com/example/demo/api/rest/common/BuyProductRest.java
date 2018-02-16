package com.example.demo.api.rest.common;


import com.example.demo.blo.interfaces.common.IBuyProductBlo;
import com.example.demo.entity.common.BuyProduct;
import com.example.demo.framework.rest.BaseRest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/buy-product")
public class BuyProductRest extends BaseRest<BuyProduct, Integer> {

    private final IBuyProductBlo buyProductBlo;

    /**
     * Inject blo
     *
     * @param buyProductBlo interfaz blo
     */
    public BuyProductRest(IBuyProductBlo buyProductBlo) {
        super(buyProductBlo);
        this.buyProductBlo = buyProductBlo;
    }
}
