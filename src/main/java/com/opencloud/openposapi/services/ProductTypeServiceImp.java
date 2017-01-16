package com.opencloud.openposapi.services;

import com.opencloud.openposapi.entities.ProductType;
import com.opencloud.openposapi.repositories.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * Created by ivanchan on 16/1/2017.
 */
@Service("ProductTypeService")
public class ProductTypeServiceImp implements ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepo;

    @Override
    public ProductType getProductType(UUID productTypeKey) {
        return this.productTypeRepo.findOne(productTypeKey);
    }

    @Override
    public List<ProductType> listProductType() {
        return this.productTypeRepo.findAll();
    }

    @Override
    public ProductType addProductType(ProductType productType) {
        if (productType.getProductTypeKey() == null) {
            productType.setProductTypeKey(UUID.randomUUID());
        }
        return this.productTypeRepo.save(productType);
    }

    @Override
    public ProductType updateProductType(ProductType productType) {
        ProductType existProductType = this.productTypeRepo.findOne(productType.getProductTypeKey());
        if (existProductType == null) {
            return null;
        }
        existProductType.setDescription(productType.getDescription());
        existProductType.setProductTypeName(productType.getProductTypeName());
        return this.productTypeRepo.save(existProductType);
    }

    @Override
    public void deleteProductType(UUID productType) {
        if (this.productTypeRepo.findOne(productType) != null) {
            this.productTypeRepo.delete(productType);
        }
    }
}
