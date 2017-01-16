package com.opencloud.openposapi.controllers;

import com.opencloud.openposapi.entities.ProductType;
import com.opencloud.openposapi.services.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Created by 29jan on 1/16/2017.
 */

@RestController
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeServ;

    @RequestMapping(value = "/producttype", method = RequestMethod.GET)
    public ResponseEntity<List<ProductType>> listProductType() {
        List<ProductType> lstProductType = productTypeServ.listProductType();
        return new ResponseEntity<List<ProductType>>(lstProductType, HttpStatus.OK);
    }

    @RequestMapping(value = "/producttype/{id}", method = RequestMethod.GET)
    public ResponseEntity<ProductType> getProductType(@PathVariable("id")UUID channelKey){
        ProductType productType = productTypeServ.getProductType(channelKey);
        return new ResponseEntity<>(productType, HttpStatus.OK);
    }

    @RequestMapping(value = "/producttype", method = RequestMethod.POST)
    public ResponseEntity<ProductType> addProductType(@RequestBody ProductType productType) {
        ProductType savedType = productTypeServ.addProductType(productType);
        return new ResponseEntity<ProductType>(savedType, HttpStatus.OK);
    }

    @RequestMapping(value = "/producttype/{id}", method = RequestMethod.PUT)
    public ResponseEntity<ProductType> updateProductType(@PathVariable("id")UUID productTypeKey, @RequestBody ProductType productType) {
        ProductType savedType = productTypeServ.updateProductType(productTypeKey, productType);
        return new ResponseEntity<ProductType>(savedType, HttpStatus.OK);
    }
}
