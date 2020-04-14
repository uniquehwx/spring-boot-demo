package com.xkcoding.mq.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author hwx
 * @date 2020/4/13
 */
@Component
@RabbitListener(queues = "q_fanout_B")
public class Fanout_ReceiverB {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("AReceiver  : " + hello + "/n");
    }
}
