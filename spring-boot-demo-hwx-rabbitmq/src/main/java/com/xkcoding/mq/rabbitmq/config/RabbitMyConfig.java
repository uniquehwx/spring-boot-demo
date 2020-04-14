package com.xkcoding.mq.rabbitmq.config;

import com.rabbitmq.client.AMQP;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author hwx
 * @date 2020/4/12
 */
@Configuration
public class RabbitMyConfig {

    @Bean
    public Queue queue(){
      return  new Queue("helloRabbit");
    }
}
