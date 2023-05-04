package com.sbaws.product.service;

import com.sbaws.product.entities.Product;
import com.sbaws.product.exception.ProductNotFoundException;
import com.sbaws.product.models.ProductRequest;
import com.sbaws.product.models.ProductResponse;
import com.sbaws.product.repository.ProductRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(ProductRequest productRequest) {
        log.info("Adding Product..");
        Product product = Product.builder()
                .productName(productRequest.getProductName())
                .quantity(productRequest.getQuantity())
                .price(productRequest.getPrice())
                .build();
        productRepository.save(product);
        log.info("Product Details are created::");
        return product;
    }

    @Override
    public ProductResponse getProductById(Integer productId) {
        log.info("Get the Product for productId..", productId);
        Product product
                = productRepository.findById(productId)
                .orElseThrow(
                        () -> new ProductNotFoundException("Product with given id not Found","PRODUCT_NOT_FOUND"));

        log.info("Product Details are now we are assigned productDetails to ProductResponse");
        ProductResponse productResponse = new ProductResponse();
        log.info("assigned productDetails to ProductResponse either we are using Builder pattern or BeanUtils");
        BeanUtils.copyProperties(product, productResponse);
        return productResponse;
    }
}
