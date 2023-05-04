package com.sbaws.product.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String productName;
    private Long price;
    private Long quantity;
}
