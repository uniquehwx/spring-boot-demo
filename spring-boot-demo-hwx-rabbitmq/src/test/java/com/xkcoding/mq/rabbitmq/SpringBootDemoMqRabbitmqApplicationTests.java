package com.xkcoding.mq.rabbitmq;

import com.xkcoding.mq.rabbitmq.provide.MsgSender;
import com.xkcoding.mq.rabbitmq.provide.MsgSenderFanout;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoMqRabbitmqApplicationTests {
    @Autowired
    private RabbitProviude RabbitProviude;


    /**
     * 测试直接模式发送
     */
    @Test
    public void sendDirect() {
        for (int i=0;i<100;i++){
            RabbitProviude.send();
        }
    }

//.Topic Exchange（主题模式）
    @Autowired
    private MsgSender msgSender;
    @Test
    public void send1() throws Exception {
        msgSender.send1();
    }

    @Test
    public void send2() throws Exception {
        msgSender.send2();
    }
    //FanoutTEstFanout Exchange（订阅模式）
    @Autowired
    private MsgSenderFanout msgSender2;

    @Test
    public void send3() throws Exception {
        msgSender2.send();
    }
}

