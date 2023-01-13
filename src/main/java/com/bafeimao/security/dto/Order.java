package com.bafeimao.security.dto;

import lombok.*;

/**
 * @projectName: security
 * @package: com.bafeimao.security.dto
 * @className: Order
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/12 22:42
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
