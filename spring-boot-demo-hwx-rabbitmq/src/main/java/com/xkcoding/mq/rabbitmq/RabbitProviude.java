package com.xkcoding.mq.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author hwx
 * @date 2020/4/12
 */
@Component
public class RabbitProviude {
   @Autowired
   private AmqpTemplate amqpTemplate;

   public  void  send(){
       String message="hello"+ new Date();
       amqpTemplate.convertAndSend("helloRabbit",message);
   }
}
