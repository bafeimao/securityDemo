package com.bafeimao.security.message;

import com.bafeimao.security.config.MessagingConfig;
import com.bafeimao.security.dto.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @projectName: security
 * @package: com.bafeimao.security.message
 * @className: User
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/12 22:50
 * @version: 1.0
 */
@Component
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumerMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message received from queue:" + orderStatus);
    }
}
