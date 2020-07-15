package com.fums.template_setting.utils;

import com.fums.template_setting.pojo.template;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author: 赵林
 * @Date: 2020/7/12 10:40
 * @Description:
 */
    @Configuration
    public class RedisConfig<T>{
        @Bean
        public RedisTemplate<String, template>redisTemplate(RedisConnectionFactory factory){
            RedisTemplate<String,template>template=new RedisTemplate<>();
            //关联
            template.setConnectionFactory(factory);
            //设置key的序列化器
            template.setKeySerializer(new StringRedisSerializer());
            //设置value的序列化器
            template.setValueSerializer(new Jackson2JsonRedisSerializer<>(template.class));
            return template;
        }


}
