package com.bafeimao.security.message;

import com.bafeimao.security.config.MessagingConfig;
import com.bafeimao.security.dto.Order;
import com.bafeimao.security.dto.OrderStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @projectName: security
 * @package: com.bafeimao.security.message
 * @className: OrderPublish
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/12 22:44
 * @version: 1.0
 */
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderPublish {
    private final RabbitTemplate rabbitTemplate;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "order placed successfully in" + restaurantName);
        rabbitTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, orderStatus);
        return "Success";
    }

}
