package com.opencloud.openposapi.controllers;

import com.opencloud.openposapi.entities.ProductType;
import com.opencloud.openposapi.services.ProductTypeService;
import com.sun.corba.se.spi.ior.ObjectId;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
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

}
