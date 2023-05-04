package com.sbaws.product.controller;

import com.sbaws.product.entities.Product;
import com.sbaws.product.models.ProductRequest;
import com.sbaws.product.models.ProductResponse;
import com.sbaws.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<?> addProduct(@RequestBody ProductRequest productRequest) {
        Product product = productService.addProduct(productRequest);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductResponse> getProductDetailsById(@PathVariable("productId") Integer pid) {
        ProductResponse productResponse = productService.getProductById(pid);
        return new ResponseEntity<>(productResponse, HttpStatus.OK);
    }
}
