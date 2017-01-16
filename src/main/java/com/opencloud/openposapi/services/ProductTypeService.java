package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.ProductType;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 16/1/2017.
 */
public interface ProductTypeService {
    ProductType getProductType(UUID productTypeKey);
    List<ProductType> listProductType();
    ProductType addProductType(ProductType productType);
    ProductType updateProductType(UUID productTypeKey, ProductType productType);
    void deleteProductType(UUID productType);
}
