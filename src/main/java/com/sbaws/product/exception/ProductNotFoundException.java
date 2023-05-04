package com.sbaws.product.exception;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ProductNotFoundException extends RuntimeException {
    private String errorCode;

    public ProductNotFoundException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
