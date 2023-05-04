package com.sbaws.product.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    private Integer productId;
    private String productName;
    private Long price;
    private Long quantity;
}
