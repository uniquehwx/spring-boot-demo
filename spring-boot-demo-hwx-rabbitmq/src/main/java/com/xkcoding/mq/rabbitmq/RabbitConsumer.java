package com.xkcoding.mq.rabbitmq;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author hwx
 * @date 2020/4/12
 */
@Component
@RabbitListener(queues = "helloRabbit")
public class RabbitConsumer {

    @RabbitHandler
    public  void  getMessage(String contend){
        System.out.print(contend);
    }
}
