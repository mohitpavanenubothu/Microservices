package com.sbaws.product.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Product_Details")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence")
    private Integer productId;

    @Column(name = "Product_Name")
    private String productName;

    @Column(name = "Price")
    private Long price;

    @Column(name = "Quantity")
    private Long quantity;
}
