package com.xkcoding.mq.rabbitmq.constants;

/**
 * <p>
 * RabbitMQ常量池
 * </p>
 *
 * @package: com.xkcoding.mq.rabbitmq.constants
 * @description: RabbitMQ常量池
 * @author: yangkai.shen
 * @date: Created in 2018-12-29 17:08
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
public interface RabbitConsts {
    /**
     * 直接模式1
     */
    String DIRECT_MODE_QUEUE_ONE = "queue.direct.1";

    /**
     * 队列2
     */
    String QUEUE_TWO = "queue.2";

    /**
     * 队列3
     */
    String QUEUE_THREE = "3.queue";

    /**
     * 分列模式
     */
    String FANOUT_MODE_QUEUE = "fanout.mode1";

    /**
     * 主题模式
     */
    String TOPIC_MODE_QUEUE = "topic.mode1";

    /**
     * 路由1
     */
    String TOPIC_ROUTING_KEY_ONE = "queue.#";

    /**
     * 路由2
     */
    String TOPIC_ROUTING_KEY_TWO = "*.queue";

    /**
     * 路由3
     */
    String TOPIC_ROUTING_KEY_THREE = "3.queue";

    /**
     * 延迟队列
     */
    String DELAY_QUEUE = "delay.queue1";

    /**
     * 延迟队列交换器
     */
    String DELAY_MODE_QUEUE = "delay.mode1";
}
