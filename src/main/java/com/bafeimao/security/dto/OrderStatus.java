package com.bafeimao.security.dto;

import lombok.*;

/**
 * @projectName: security
 * @package: com.bafeimao.security.dto
 * @className: OrderStatus
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/12 22:43
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class OrderStatus {

    private Order order;
    private String status;
    private String message;
}
