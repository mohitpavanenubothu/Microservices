package com.sbaws.product.service;

import com.sbaws.product.entities.Product;
import com.sbaws.product.models.ProductRequest;
import com.sbaws.product.models.ProductResponse;

public interface ProductService {
    public Product addProduct(ProductRequest productRequest);

    public ProductResponse getProductById(Integer productId);

    /*echo "# Microservices" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/mohitpavanenubothu/Microservices.git
    git push -u origin main*/
}
