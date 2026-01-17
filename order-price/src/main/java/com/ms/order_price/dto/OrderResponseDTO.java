package com.ms.order_price.dto;

import lombok.Data;

@Data
public class OrderResponseDTO {

    private Long orderId;
    private Long productId;
    private Integer quantity;
    private double totalPrice;

    // product details
    private String productName;
    private double productPrice;
}
